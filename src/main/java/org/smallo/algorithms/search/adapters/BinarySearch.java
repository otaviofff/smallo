package org.smallo.algorithms.search.adapters;

import org.smallo.algorithms.sort.Factory;
import org.smallo.common.Array;

public class BinarySearch implements AbstractSearch {

    @Override
    public int search(int[] haystack, int needle) {
        if (!Array.sorted(haystack)) {
            Factory.getAlgorithm("quick").sort(haystack);
        }
        
        return search(haystack, needle, 0, haystack.length - 1);
    }
    
    private int search(int[] haystack, int needle, int min, int max) {
        int pivot = (max + min) / 2;
        
        if (pivot < min || pivot > max) {
            return -1;
        }
        
        if (needle == haystack[pivot]) {
            return pivot;
        }
        
        if (needle < haystack[pivot]) {
            max = pivot - 1;
        } else {
            min = pivot + 1;
        }
        
        return search(haystack, needle, min, max); 
    }
}