package org.smallo.algorithms.search;

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
                    command.getInputAsArray(), 
                    command.getInputAsInteger()
                    );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void runAlgorithm(String name, int[] haystack, int needle) {
        Timer timer = new Timer();
        
        timer.start();
        int index = Factory.getAlgorithm(name).search(haystack, needle);
        timer.stop();
        
        printReport(haystack, needle, index, timer.timeElapsed());
    }
    
    private static void printReport(int[] haystack, int needle, int index, long elapsed) {
        System.out.println("Haystack:");
        Array.print(haystack, 2);
        
        System.out.println("Needle:");
        System.out.println(needle + "\n");
        
        System.out.println("Result: ");        
        
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}