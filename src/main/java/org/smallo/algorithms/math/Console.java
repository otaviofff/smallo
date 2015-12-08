package org.smallo.algorithms.math;

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
                    command.getInputAsInteger()
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void runAlgorithm(String name, int input) {
        Timer timer = new Timer();
        
        timer.start();
        int output = Factory.getAlgorithm(name).calculate(input);
        timer.stop();
        
        int[] sequence = Factory.getAlgorithm(name).sequence(input);
        
        printReport(input, output, sequence, timer.timeElapsed());
    }
    
    private static void printReport(int input, int output, int[] sequence, long elapsed) {
        System.out.println("Input:");
        System.out.println(input + "\n");
        
        System.out.println("Output:");
        System.out.println(output + "\n");
        
        System.out.println("Sequence:");
        Array.print(sequence, 2);
        
        System.out.println("Elapsed:");
        System.out.println(elapsed + " ms");
    }
}