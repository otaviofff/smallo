package org.smallo.algorithms.math.adapters;

public class Factorial implements AbstractMath {

    public int calculate(int n) {
        if (n < 2) {
            return 1;
        }
        
        return n * calculate(n - 1);
    }
    
    public int[] sequence(int length) {
        int[] sequence = new int[length + 1];
        
        sequence[0] = 1;
        
        for (int n = 1; n < sequence.length; n ++) {
            sequence[n] = n * sequence[n - 1];
        }
        
        return sequence;
    }
}