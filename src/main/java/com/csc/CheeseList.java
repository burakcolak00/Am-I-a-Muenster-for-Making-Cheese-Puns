package com.csc;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public int calculateNumberOfCheesesWithSomeProperty(String property) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getProperty().equals(property)) {
                count++;
            }
        }
        return count;
    }

    // 1. Count cheeses by milk treatment type
    public int countByMilkTreatmentType(String treatmentType) {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getMilkTreatmentType() != null &&
                cheese.getMilkTreatmentType().equalsIgnoreCase(treatmentType)) {
                count++;
            }
        }
        return count;
    }

    // 2. Count organic cheeses with moisture > 41.0%
    public int countOrganicHighMoisture() {
        int count = 0;
        for (Cheese cheese : cheeses) {
            if (cheese.getOrganic() == 1 && cheese.getMoisturePercent() > 41.0) {
                count++;
            }
        }
        return count;
    }

    // 3. Find the most common milk type
    public String mostCommonMilkType() {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        for (Cheese cheese : cheeses) {
            String milkType = cheese.getMilkType();
            if (milkType != null && !milkType.isEmpty()) {
                map.put(milkType, map.getOrDefault(milkType, 0) + 1);
            }
        }
        String mostCommon = null;
        int max = 0;
        for (String type : map.keySet()) {
            if (map.get(type) > max) {
                max = map.get(type);
                mostCommon = type;
            }
        }
        return mostCommon;
    }
}
