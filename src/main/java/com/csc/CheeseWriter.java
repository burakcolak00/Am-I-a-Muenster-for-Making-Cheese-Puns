package com.csc;

import java.io.FileOutputStream;

public class CheeseWriter {
    private String filename;

    public CheeseWriter(String outputFilename) {
        this.filename = outputFilename;
    }

    public void writeData(String string) {
        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            byte[] strToBytes = string.getBytes();
            outputStream.write(strToBytes);
            outputStream.close();
        } catch (Exception e) {
            //do something
            // Handle exception
            System.err.println("Error writing data: " + e.getMessage());
        }
    }

}
