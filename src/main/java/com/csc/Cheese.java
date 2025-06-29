package com.csc;

public class Cheese {
    private String id;
    private String milkType;
    private String property;
    private String milkTreatmentType;
    private int organic;
    private double moisturePercent;

    public Cheese(String id, String milkType, String property, String milkTreatmentType, int organic, double moisturePercent) {
        this.id = id;
        this.milkType = milkType;
        this.property = property;
        this.milkTreatmentType = milkTreatmentType;
        this.organic = organic;
        this.moisturePercent = moisturePercent;
    }

    public String getMilkTreatmentType() { return milkTreatmentType; }
    public int getOrganic() { return organic; }
    public double getMoisturePercent() { return moisturePercent; }
    public String getProperty() { return property; }
    public String getMilkType() { return milkType; }
    public String getId() { return id; }
}
