package com.WorkintechS18G3.carRDcompany;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterrySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterrySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterrySize = batterrySize;
    }

    public double avgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterrySize() {
        return batterrySize;
    }
}
