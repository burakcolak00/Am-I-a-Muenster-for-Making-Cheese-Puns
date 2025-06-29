package com.csc;

public class CheeseParser {
    public Cheese parse(String s) {
        // Skip header or empty lines
        if (s == null || s.trim().isEmpty() || s.startsWith("CheeseId")) {
            return null;
        }
        String[] parts = s.split(",", -1); // -1 keeps empty fields
        if (parts.length > 12) {
            String id = parts[0].trim();
            String milkType = parts[8].trim();
            String property = parts[12].trim();
            String milkTreatmentType = parts[9].trim();
            int organic = 0;
            try { organic = Integer.parseInt(parts[6].trim()); } catch (Exception e) {}
            double moisturePercent = 0.0;
            try { moisturePercent = Double.parseDouble(parts[3].trim()); } catch (Exception e) {}
            return new Cheese(id, milkType, property, milkTreatmentType, organic, moisturePercent);
        } else {
            return null;
        }
    }
}
