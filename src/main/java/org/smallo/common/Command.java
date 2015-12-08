package org.smallo.common;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Command {
    
    private CommandLine command;

    public void parseArguments(String[] args) throws ParseException {
        if (command == null) {
            Options options = new Options();
            
            options.addOption("a", true,  "Algorithm to be executed.");
            options.addOption("n", true,  "Number passed onto a calculation function.");
            options.addOption("l", true,  "Length of the array to be created.");
            options.addOption("u", false, "Whether the array will contain unique elements only.");
            options.addOption("v", false, "Whether the final report should be printed.");
    
            CommandLineParser parser = new DefaultParser();
            
            command = parser.parse(options, args);
        }
    }
    
    public int[] getInputAsArray() {
        if (command == null) {
            return null;
        }
        
        return Array.make(
                Integer.valueOf(command.getOptionValue("l")), 
                command.hasOption("u")
                );
    }
    
    public Integer getInputAsInteger() {
        if (command == null) {
            return null;
        }
        
        return Integer.valueOf(command.getOptionValue("n"));
    }
    
    public String getAlgorithmName() {
        if (command == null) {
            return null;
        }
        
        return command.getOptionValue("a");
    }
    
    public Boolean verbose() {
        if (command == null) {
            return null;
        }
        
        return command.hasOption("v");
    }
}