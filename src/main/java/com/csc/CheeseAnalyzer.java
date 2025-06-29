package com.csc;

public class CheeseAnalyzer {
  public static void main(String[] args) {
    // Read in cheese data and turn it into a list of Cheese objects
    CheeseReader reader = new CheeseReader("cheese_data.csv");
    CheeseList list = reader.readCheeses();

    // Perform calculations
    int pasteurizedCount = list.countByMilkTreatmentType("Pasteurized");
    int rawCount = list.countByMilkTreatmentType("Raw Milk");
    int organicHighMoistureCount = list.countOrganicHighMoisture();
    String mostCommonMilkType = list.mostCommonMilkType();

    // Prepare output
    StringBuilder output = new StringBuilder();
    output.append("Number of cheeses using pasteurized milk: ").append(pasteurizedCount).append("\n");
    output.append("Number of cheeses using raw milk: ").append(rawCount).append("\n");
    output.append("Number of organic cheeses with moisture > 41.0%: ").append(organicHighMoistureCount).append("\n");
    output.append("Most common milk type: ").append(mostCommonMilkType).append("\n");

    // Write the results to a file
    CheeseWriter writer = new CheeseWriter("output.txt");
    writer.writeData(output.toString());
  }
}
