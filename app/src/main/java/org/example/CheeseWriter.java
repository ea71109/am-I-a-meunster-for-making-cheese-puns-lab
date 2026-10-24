package org.example;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CheeseWriter {
    public void printResults(String outputName, int pasteurized, int raw, int organicMoisture, String commonMilk)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputName)))
        {
            writer.println("Pasteurized milk cheeses: " + pasteurized);
            writer.println("Raw milk cheeses: " + raw);
            writer.println("Organic cheeses with moisture over 41%: " + organicMoisture);
            writer.println("Most common type of cheese: " + commonMilk + " cheese");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
