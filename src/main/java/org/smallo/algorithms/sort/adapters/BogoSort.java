package org.smallo.algorithms.sort.adapters;

import org.smallo.algorithms.shuffle.Factory;
import org.smallo.algorithms.shuffle.adapters.AbstractShuffle;
import org.smallo.common.Array;

public class BogoSort implements AbstractSort {

    @Override
    public int[] sort(int[] input) {
        
        AbstractShuffle monkey = Factory.getAlgorithm("fisher");
        
        while (!Array.sorted(input)) {
            monkey.shuffle(input);
        }
        
        return input;
    }

    @Override
    public boolean inPlace() {
        return true;
    }
}