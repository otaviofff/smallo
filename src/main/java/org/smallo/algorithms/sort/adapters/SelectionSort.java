package org.smallo.algorithms.sort.adapters;

import org.smallo.common.Array;

public class SelectionSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        sort(input, 0);
        
        return input;
    }
    
    private void sort(int[] input, int min) {
        if (min >= input.length - 1) {
            return;
        }
        
        int minFound = min;
        
        for (int i = minFound; i < input.length; i ++) {
            if (input[i] < input[minFound]) {
                minFound = i;
            }
        }
        
        if (minFound != min) {
            Array.swap(input, min, minFound);
        }
        
        sort(input, min + 1);
    }

    @Override
    public boolean inPlace() {
        return true;
    }
}