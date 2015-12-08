package org.smallo.algorithms.shuffle.adapters;

import org.smallo.common.Array;

public class FisherYatesShuffle implements AbstractShuffle {

    @Override
    public int[] shuffle(int[] input) {
        for (int i = 0; i < input.length; i ++) {
            int j = (int) (input.length * Math.random());
            Array.swap(input, i, j);
        }
        
        return input;
    }
}