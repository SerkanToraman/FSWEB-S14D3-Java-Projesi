package com.WorkintechS18G3.carRDcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + " starting engine";
    }
    public String drive(){
        runEngine(this);
        return getName() + " is driving...";
    }

    public void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            ((GasPoweredCar)carSkeleton).getAvgKmPerLitre();
            System.out.println("The car engine runs with gas.");
        } else if(carSkeleton instanceof HybridCar){
            System.out.println("The car engine runs with both gas and electric.");
            ((HybridCar)carSkeleton).getAvgKmPerLitre();
        } else if(carSkeleton instanceof ElectricCar){
            ((ElectricCar)carSkeleton).avgKmPerCharge();
            System.out.println("The car engine runs with electric.");
        } else{
            System.out.println("Car type is not valid");
        }
    }

}
