package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCheeseAnalyzer {
  @Test
  public void testCountByMilkTreatmentType() {
    CheeseList list = new CheeseList();
    list.addCheese(new Cheese("1", "Cow", "low fat", "Pasteurized", 0, 40.0));
    list.addCheese(new Cheese("2", "Goat", "low fat", "Raw Milk", 1, 42.0));
    list.addCheese(new Cheese("3", "Cow", "low fat", "Pasteurized", 1, 45.0));
    assertEquals(2, list.countByMilkTreatmentType("Pasteurized"));
    assertEquals(1, list.countByMilkTreatmentType("Raw Milk"));
  }

  @Test
  public void testCountOrganicHighMoisture() {
    CheeseList list = new CheeseList();
    list.addCheese(new Cheese("1", "Cow", "low fat", "Pasteurized", 1, 42.0));
    list.addCheese(new Cheese("2", "Goat", "low fat", "Raw Milk", 1, 39.0));
    list.addCheese(new Cheese("3", "Cow", "low fat", "Pasteurized", 0, 50.0));
    assertEquals(1, list.countOrganicHighMoisture());
  }

  @Test
  public void testMostCommonMilkType() {
    CheeseList list = new CheeseList();
    list.addCheese(new Cheese("1", "Cow", "low fat", "Pasteurized", 0, 40.0));
    list.addCheese(new Cheese("2", "Goat", "low fat", "Raw Milk", 1, 42.0));
    list.addCheese(new Cheese("3", "Cow", "low fat", "Pasteurized", 1, 45.0));
    assertEquals("Cow", list.mostCommonMilkType());
  }
}
