package com.csc;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private String filename;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner cleaner = new CheeseRowCleaner();

    public CheeseReader(String filename) {
        this.filename = filename;
    }

    public CheeseList readCheeses() {
        CheeseList cheeseList = new CheeseList();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                Cheese cheese = deserializeCheese(line);
                if (cheese != null) {
                    cheeseList.addCheese(cheese);
                }
            }
            reader.close();
        } catch (Exception e) {
            // do something
        }

        return cheeseList;
    }

    public Cheese deserializeCheese(String line) {
        String cleanedLine = cleaner.clean(line);
        Cheese cheese = parser.parse(cleanedLine);
        return cheese;
    }
}
