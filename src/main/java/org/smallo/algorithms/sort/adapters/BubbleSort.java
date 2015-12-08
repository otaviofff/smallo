package org.smallo.algorithms.sort.adapters;

import org.smallo.common.Array;

public class BubbleSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        boolean swaped = false;
        
        for (int i = 0; i < input.length - 1; i ++) {
            if (input[i] > input[i + 1]) {
                Array.swap(input, i, i + 1);
                swaped = true;
            }
        }
        
        if (swaped) {
            return sort(input);
        }
        
        return input;
    }

    @Override
    public boolean inPlace() {
        return true;
    }
}