package org.smallo.algorithms.sort.adapters;

import org.smallo.common.Array;

public class MergeSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        if (input.length < 2) {
            return input;
        }
        
        int[][] halves = Array.split(input);
        int[] left = halves[0];
        int[] right = halves[1];
        
        return merge(sort(left), sort(right));
    }
    
    private int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while ((i < left.length) && (j < right.length) && (k < merged.length)) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i ++;
            } else {
                merged[k] = right[j];
                j ++;
            }
            
            k ++;
        }
        
        while (i < left.length) {
            merged[k] = left[i];
            i ++;
            k ++;
        }
        
        while (j < right.length) {
            merged[k] = right[j];
            j ++;
            k ++;
        }
        
        return merged;
    }

    @Override
    public boolean inPlace() {
        return false;
    }
}