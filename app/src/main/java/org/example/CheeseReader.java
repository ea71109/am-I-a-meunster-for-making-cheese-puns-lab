package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private String filename;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner cleaner = new CheeseRowCleaner();

    public CheeseReader(String inputFileName)
    {
        filename = inputFileName;
    }

    public CheeseList readCheeses()
    {
        CheeseList list = new CheeseList();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null)
            {
                Cheese cheese = deserializeCheese(line);
                list.addCheese(cheese);
            }
            reader.close();
        } catch (Exception e)
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        return list;
    }

    private Cheese deserializeCheese(String line)
    {
        String cleanedLine = cleaner.cleanRows(line);
        Cheese cheese = parser.parseLines(cleanedLine);
        return cheese;
    }

}
