package com.WorkintechS18G3.carRDcompany;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterrySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterrySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterrySize = batterrySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterrySize() {
        return batterrySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
