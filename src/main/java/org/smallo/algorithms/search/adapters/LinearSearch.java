package org.smallo.algorithms.search.adapters;

public class LinearSearch implements AbstractSearch {

    @Override
    public int search(int[] haystack, int needle) {
        for (int i = 0; i < haystack.length; i ++) {
            if (haystack[i] == needle) {
                return i;
            }
        }
        
        return -1;
    }
}