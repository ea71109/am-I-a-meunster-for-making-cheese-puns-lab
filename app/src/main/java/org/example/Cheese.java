package org.example;

public class Cheese {
    private String milkTreatmentType;
    private int organic;
    private double moisturePercent;
    private String milkType;

    public Cheese(String milkTreatmentType, int organic, double moisturePercent, String milkType)
    {
        this.milkTreatmentType = milkTreatmentType.trim().toLowerCase();
        this.organic = organic;
        this.moisturePercent = moisturePercent;
        this.milkType = milkType.trim().toLowerCase();
    }

    public boolean isPasteurized()
    {
        return milkTreatmentType.contains("pasteuriz");
    }

    public boolean isRaw()
    {
        return milkTreatmentType.contains("raw");
    }

    public boolean isOrganicAndHighMoisture()
    {
        return organic == 1 && moisturePercent > 41.0;
    }

    public String getMilkTreatmentType()
    {
        return milkTreatmentType;
    }

    public int getOrganic()
    {
        return organic;
    }

    public double getMoisturePercent()
    {
        return moisturePercent;
    }

    public String getMilkType()
    {
        return milkType;
    }
}
