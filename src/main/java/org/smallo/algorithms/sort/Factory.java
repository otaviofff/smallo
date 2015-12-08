package org.smallo.algorithms.sort;

import org.smallo.algorithms.sort.adapters.AbstractSort;
import org.smallo.algorithms.sort.adapters.BogoSort;
import org.smallo.algorithms.sort.adapters.BubbleSort;
import org.smallo.algorithms.sort.adapters.HeapSort;
import org.smallo.algorithms.sort.adapters.InsertionSort;
import org.smallo.algorithms.sort.adapters.MergeSort;
import org.smallo.algorithms.sort.adapters.QuickSort;
import org.smallo.algorithms.sort.adapters.SelectionSort;

public class Factory {
    
    public static AbstractSort getAlgorithm(String name) {
        switch (name) {
            case "bogo": 
                return new BogoSort();
            case "bubble":
                return new BubbleSort();
            case "heap":
                return new HeapSort();
            case "insertion":
                return new InsertionSort();
            case "merge": 
                return new MergeSort();
            case "quick":
                return new QuickSort();
            case "selection":
                return new SelectionSort();
            default:
                return null;
        }
    }
}