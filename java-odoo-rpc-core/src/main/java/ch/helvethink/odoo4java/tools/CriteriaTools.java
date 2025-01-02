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

package ch.helvethink.odoo4java.tools;

import ch.helvethink.odoo4java.FetchException;

import java.util.ArrayList;
import java.util.List;

/**
 * Tooling class for criteria
 */
public final class CriteriaTools {

    /**
     * Hide constructor because this is a tooling class
     */
    private CriteriaTools(){}

    /**
     * Group varargs by 3 for requests
     * @param requestCriteria List of objects for request
     * @return criteria grouped
     */
    public static List<List<List<Object>>> groupCriteria(final Object[] requestCriteria) {
        checkCriteriaArraySize(requestCriteria);
        final List<List<Object>> criteria = new ArrayList<>();
        for(int i = 0; i < requestCriteria.length; i = i+3) {
            criteria.add(List.of(requestCriteria[i],requestCriteria[i+1],requestCriteria[i+2]));
        }
        return List.of(criteria);
    }

    /**
     * Check if array is well constructed
     * @param requestCriteria The request criteria array
     */
    private static void checkCriteriaArraySize(final Object[] requestCriteria) {
        if(requestCriteria.length % 3 != 0) {
            throw new FetchException("Criteria must be an array of size dividable by 3 (term1, operator, term2) for each criteria");
        }
    }

    /**
     * Group varargs by 3 for requests
     * @param requestCriteria List of strings for request
     * @return criteria grouped
     */
    public static List<List<List<String>>> groupCriteria(final String[] requestCriteria) {
        if(requestCriteria.length % 3 != 0) {

        }
        final List<List<String>> criteria = new ArrayList<>();
        for(int i = 0; i < requestCriteria.length; i = i+3) {
            criteria.add(List.of(requestCriteria[i],requestCriteria[i+1],requestCriteria[i+2]));
        }
        return List.of(criteria);
    }

}
