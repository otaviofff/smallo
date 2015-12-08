package org.smallo.algorithms.shuffle;

import org.smallo.algorithms.shuffle.adapters.AbstractShuffle;
import org.smallo.algorithms.shuffle.adapters.FisherYatesShuffle;

public class Factory {

    public static AbstractShuffle getAlgorithm(String name) {
        switch (name) {
            case "fisher":
                return new FisherYatesShuffle();
            default:
                return null;
        }
    }
}