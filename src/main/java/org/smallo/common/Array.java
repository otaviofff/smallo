package org.smallo.common;

public class Array {
    
    public static int[] make(int size, boolean unique) {
        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i ++) {
            array[i] = unique ? i : (int) (size * Math.random());
        }
        
        return array;
    }
    
    public static int[][] split(int[] input) {
        int length = input.length;
        int middle = (int) length / 2;
        
        int[] left  = new int[middle];
        int[] right = new int[length - middle];
        
        System.arraycopy(input, 0, left, 0, left.length);
        System.arraycopy(input, middle, right, 0, right.length);
        
        int[][] output = new int[2][length - middle];
        
        output[0] = left;
        output[1] = right;
        
        return output;
    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void print(int[] array, int lineBreaks) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < lineBreaks; i ++) {
            System.out.println();
        }
    }
    
    public static boolean sorted(int[] array) {
        int i = 0;
        boolean sorted = true;
        
        while (sorted && i < array.length - 1) {
            sorted = array[i] <= array[i + 1];
            i ++;
        }
        
        return sorted;
    }
}