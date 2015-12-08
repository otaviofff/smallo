package org.smallo.algorithms.math;

import org.smallo.algorithms.math.adapters.AbstractMath;
import org.smallo.algorithms.math.adapters.Factorial;
import org.smallo.algorithms.math.adapters.Fibonacci;

public class Factory {

    public static AbstractMath getAlgorithm(String name) {
        switch (name) {
            case "factorial":
                return new Factorial();
            case "fibonacci":
                return new Fibonacci();
            default:
                return null;
        }
    }
}
