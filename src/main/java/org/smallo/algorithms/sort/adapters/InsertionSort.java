package org.smallo.algorithms.sort.adapters;

public class InsertionSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        sort(input, 1);
        
        return input;
    }
    
    private void sort(int[] input, int unsortedIndex) {
        if (unsortedIndex >= input.length) {
            return;
        }
        
        int insertIndex = -1;
        int sortedIndex = unsortedIndex - 1;
        
        while (sortedIndex >= 0) {
            int sortedElement   = input[sortedIndex];
            int unsortedElement = input[unsortedIndex];
            
            if (unsortedElement < sortedElement) {
                insertIndex = sortedIndex;
            } else {
                break;
            }
            
            sortedIndex --;
        }
        
        if (insertIndex > -1) {
            insert(input, unsortedIndex, insertIndex, input[unsortedIndex]);
        }
        
        sort(input, unsortedIndex + 1);
    }
    
    private void insert(int[] array, int limitIndex, int insertIndex, int insertElement) {
        if (insertIndex > limitIndex) {
            return;
        }

        int tempElement = array[insertIndex];
        array[insertIndex] = insertElement;
        
        insert(array, limitIndex, insertIndex + 1, tempElement);
    }

    @Override
    public boolean inPlace() {
        return true;
    }
}