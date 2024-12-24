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

package ch.helvethink.odoo4java.rpc;

import ch.helvethink.odoo4java.models.OdooId;
import ch.helvethink.odoo4java.models.OdooObj;

import java.util.List;

/**
 * Interface to implement for Odoo Rpc
 */
public interface OdooRpcClient {

    /**
     * Find an Odoo object using criteria with pagination.
     * If no criteria, will send all the objects (id >=0 )
     *
     * @param limit          Number of objects we want to retrieve
     * @param page           The page we want to retrieve
     * @param classToConvert Type of the target object
     * @param criteria       The search criteria
     * @param <T>            The target type
     * @return List of corresponding objects
     */
    <T extends OdooObj> List<T> findByCriteria(final int limit, final int page, final Class<T> classToConvert, final String... criteria);


    /**
     * Find an Odoo object using criteria.
     * If no criteria, will send all the objects (id >=0 )
     *
     * @param limit          Number of objects we want to retrieve
     * @param classToConvert Type of the target object
     * @param criteria       The search criteria
     * @param <T>            The target type
     * @return List of corresponding objects
     */
    <T extends OdooObj> List<T> findByCriteria(final int limit, final Class<T> classToConvert, final String... criteria);

    /**
     * Fetch an object by its id
     *
     * @param idToFetch      The id of the object we want to fetch
     * @param classToConvert The type of the target Object
     * @param <T>            The type of the target Object
     * @return The object fetched
     */
     <T extends OdooObj> T findObjectById(final OdooId idToFetch, final Class<T> classToConvert);

    /**
     * Same as {@link #findObjectById(OdooId, Class)} but with a List
     *
     * @param idsToFetch     The ids of objects we want to fetch
     * @param classToConvert The type of the target objects
     * @param <T>            The type of the target objects
     *                       If an exception occured, will send back an empty list
     * @return List of built objects
     */
    <T extends OdooObj> List<T> findListByIdsInt(final List<Integer> idsToFetch, final Class<T> classToConvert);

    /**
     * Same as above but with Odoo Ids
     *
     * @param idsToFetch     The ids of objects we want to fetch under the form of {@link OdooId}
     * @param classToConvert The type of the target objects
     * @param <T>            The type of the target objects
     * @return List of built objects
     */
    <T extends OdooObj> List<T> findListByIds(final List<OdooId> idsToFetch, final Class<T> classToConvert);
}
