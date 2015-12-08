package org.smallo.algorithms.sort.adapters;

import org.smallo.common.Array;

public class QuickSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        sort(input, 0, input.length - 1);
        
        return input;
    }
    
    private void sort(int[] input, int current, int pivot) {
        if (current >= pivot) {
            return;
        }
        
        int standingWall = current;
        int movingWall = current;
        
        while (current < pivot) {
            if (input[current] < input[pivot]) {
                Array.swap(input, movingWall, current);
                movingWall ++;
            }
            
            current ++;
        }
        
        Array.swap(input, movingWall, pivot);
        
        sort(input, movingWall + 1, current);
        sort(input, standingWall, movingWall - 1);
    }

    @Override
    public boolean inPlace() {
        return true;
    }
}