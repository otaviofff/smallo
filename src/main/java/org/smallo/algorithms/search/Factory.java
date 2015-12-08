package org.smallo.algorithms.search;

import org.smallo.algorithms.search.adapters.AbstractSearch;
import org.smallo.algorithms.search.adapters.BinarySearch;
import org.smallo.algorithms.search.adapters.LinearSearch;

public class Factory {
    
    public static AbstractSearch getAlgorithm(String name) {
        switch (name) {
            case "linear":
                return new LinearSearch();
            case "binary":
                return new BinarySearch();
            default:
                return null;
        }
    }
}