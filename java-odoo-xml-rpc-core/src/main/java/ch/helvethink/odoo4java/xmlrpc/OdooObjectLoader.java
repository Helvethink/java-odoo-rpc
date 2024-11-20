/*
 * MIT License
 *
 * Copyright (c) 2024 Helvethink
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package ch.helvethink.odoo4java.xmlrpc;

import ch.helvethink.odoo4java.FetchException;
import ch.helvethink.odoo4java.models.FieldRelation;
import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;
import ch.helvethink.odoo4java.tools.FieldUtils;
import org.apache.xmlrpc.XmlRpcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import static org.codehaus.plexus.util.StringUtils.capitalizeFirstLetter;

/**
 * Dedicated Class for loading odoo object fields
 */
public class OdooObjectLoader {

    /**
     * Simple logger
     */
    public static final Logger LOG = LoggerFactory.getLogger(OdooObjectLoader.class.getName());

    /**
     * Odoo Client used for finding of objects by ids
     */
    private final OdooClient odooClient;

    /**
     * Odoo loader
     * @param odooClient - Odoo Client to use for finding of objects by ids
     */
    public OdooObjectLoader(final OdooClient odooClient) {
        this.odooClient = odooClient;
    }

    /**
     * Fetch relationships from an Odoo object, without recursion
     *
     * @param o              The object to fetch
     * @param classesToFetch The list of types we want to fetch, If empty everything will be fetched
     */
    public void fetchRelationShips(final Object o, final List<Class<? extends OdooObj>> classesToFetch) {
        fetchRecursivelyRelationShips(o, 1, classesToFetch);
    }

    /**
     * The same as {@link #fetchRelationShips(Object, List)} but recursively
     * Warn! Since there are a lot of relationships, this increases number of calls and might be less performant
     * Ideally when using depth, indicate the classes you want to fetch to avoid wasting time
     *
     * @param o              The initial object we want to fetch relationships for
     * @param depth          The depth to which we want to fetch Objects
     * @param classesToFetch The list of types we want to fetch
     */
    public void fetchRecursivelyRelationShips(final Object o, final int depth, final List<Class<? extends OdooObj>> classesToFetch) {
        if (depth <= 0) {
            return;
        }

        Arrays.stream(o.getClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(FieldRelation.class))
                .forEach(
                        fieldRelation -> {
                            String fieldToUpdate = FieldUtils.formatFieldName(fieldRelation.getName());
                            try {
                                final Class<?> loadedClass = Class.forName(fieldRelation.getAnnotation(FieldRelation.class).value(), true, Thread.currentThread().getContextClassLoader());
                                setField(o, depth, classesToFetch, fieldRelation, loadedClass, fieldToUpdate);
                            } catch (final IllegalAccessException | ClassNotFoundException | XmlRpcException | InvocationTargetException |
                                           NoSuchMethodException e) {
                                throw new FetchException(e); //NOSONAR
                            }
                        }
                );
    }

    /**
     * Set a field value by reflection
     * @param o The object we want to set the field
     * @param depth The current level of recursion
     * @param classesToFetch The classes we want to fetch. If field is not of this Type, will not be set.
     * @param fieldRelation The @{@link FieldRelation} annotation for this field
     * @param loadedClass The field's class
     * @param fieldToUpdate The name of the field to update
     * @throws IllegalAccessException reflection failure
     * @throws InvocationTargetException reflection failure
     * @throws NoSuchMethodException reflection failure
     * @throws XmlRpcException Failure from odoo when fetching object designated by field from its id
     */
    private void setField(final Object o, final int depth, final List<Class<? extends OdooObj>> classesToFetch, final Field fieldRelation, final Class<?> loadedClass, final String fieldToUpdate) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, XmlRpcException {
        if(OdooObj.class.isAssignableFrom(loadedClass)) {
            final Class<? extends OdooObj> odooClass = (Class<? extends OdooObj>) loadedClass;
            if (classesToFetch.isEmpty() || classesToFetch.contains(odooClass)) {
                if (fieldRelation.getType().equals(List.class)) {
                    setListRelation(o, depth, classesToFetch, fieldRelation, fieldToUpdate, odooClass);
                } else {
                    setSimpleObjectRelation(o, depth, classesToFetch, fieldToUpdate, odooClass);
                }
            }
        } else {
            throw new FetchException("Loaded class does not implement OdooObj");
        }
    }

    /**
     * Set a field with simple type (aka not a List)
     * @param o The object
     * @param depth The current level of recursion
     * @param classesToFetch The classes we want to fetch. If field is not of this Type, will not be set.
     * @param fieldToUpdate The name of the field to update
     * @throws IllegalAccessException reflection failure
     * @throws InvocationTargetException reflection failure
     * @throws NoSuchMethodException reflection failure
     * @throws XmlRpcException Failure from odoo when fetching object designated by field from its id
     */
    private void setSimpleObjectRelation(final Object o, final int depth, final List<Class<? extends OdooObj>> classesToFetch, final String fieldToUpdate, final Class<? extends OdooObj> aClass) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, XmlRpcException {
        Object id = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
        final OdooObj fetchedObject = odooClient.findObjectById((OdooId) id, aClass);
        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsObject", aClass).invoke(o, fetchedObject);

        // recursive call if object exists and depth has not been reached
        if (fetchedObject != null) {
            fetchRecursivelyRelationShips(fetchedObject, depth - 1, classesToFetch);
        }
    }


    /**
     * Set a field with List type
     * @param o The object
     * @param depth The current level of recursion
     * @param classesToFetch The classes we want to fetch. If field is not of this Type, will not be set.
     * @param fieldToUpdate The name of the field to update
     * @throws IllegalAccessException reflection failure
     * @throws InvocationTargetException reflection failure
     * @throws NoSuchMethodException reflection failure
     */
    private void setListRelation(final Object o, final int depth, final List<Class<? extends OdooObj>> classesToFetch, final Field fieldRelation, final String fieldToUpdate, final Class<? extends OdooObj> aClass) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        LOG.debug("fieldRelation: {}", fieldRelation);

        Object ids = o.getClass().getDeclaredMethod("get" + capitalizeFirstLetter(fieldToUpdate)).invoke(o);
        final List<?> fetchedList = odooClient.findListByIdsInt((List<Integer>) ids, aClass);
        o.getClass().getDeclaredMethod("set" + capitalizeFirstLetter(fieldToUpdate) + "AsList", List.class).invoke(o, fetchedList);
        // Recursive call for each list's element if depth has not been reached and we're not in "lazy_list" mode
        for (final Object relatedObject : fetchedList) {
            fetchRecursivelyRelationShips(relatedObject, depth - 1, classesToFetch);
        }
    }
}
