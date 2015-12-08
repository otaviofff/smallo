package org.smallo.algorithms.shuffle;

import org.smallo.common.Array;
import org.smallo.common.Command;
import org.smallo.common.Timer;

public class Console {

    public static void main(String[] args) {
        Command command = new Command();
        
        try {
            command.parseArguments(args);
        
            runAlgorithm(
                    command.getAlgorithmName(),
                    command.getInputAsArray()
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void runAlgorithm(String name, int[] input) {
        Timer timer = new Timer();
        
        //Need to clone for the sake of reporting later.
        int[] clone = input.clone();
        
        timer.start();
        int[] output = Factory.getAlgorithm(name).shuffle(clone);
        timer.stop();

        printReport(input, output, timer.timeElapsed());
    }
    
    private static void printReport(int[] input, int[] output, long elapsed) {
        System.out.println("Input: ");
        Array.print(input, 2);
    
        System.out.println("Shuffled: ");
        Array.print(output, 2);
        
        System.out.println("Elapsed:");
        System.out.println(elapsed + " ms\n");
        
        if (Array.sorted(output)) {
            System.out.println("Warning:");
            System.out.println("Array is still sorted");
        }
    }
}