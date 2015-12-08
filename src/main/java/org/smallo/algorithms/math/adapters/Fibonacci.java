package org.smallo.algorithms.math.adapters;

public class Fibonacci implements AbstractMath {

    public int calculate(int n) {
        if (n < 2) {
            return n; 
        }

        return calculate(n - 1) + calculate(n - 2);
    }
    
    public int[] sequence(int length) {
        int[] sequence = new int[length + 1];
        
        sequence[0] = 0;
        
        if (length > 0) {
            sequence[1] = 1;
        }
        
        for (int n = 2; n < sequence.length; n ++) {
            sequence[n] = sequence[n - 1] + sequence[n - 2];
        }
        
        return sequence;
    }
}