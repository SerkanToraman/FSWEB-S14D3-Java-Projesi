package com.WorkintechS18G3.main;

import com.WorkintechS18G3.carRDcompany.CarSkeleton;
import com.WorkintechS18G3.carRDcompany.ElectricCar;
import com.WorkintechS18G3.carRDcompany.GasPoweredCar;

public class MainRDCompany {
    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("Tesla", "Tesla aracıdır", 430, 10);
        CarSkeleton car2 = new GasPoweredCar("Mercedes", "c180", 100, 4);
        car1.drive();
        car2.drive();
        System.out.println(car2.drive());
        System.out.println(car2.getDescription());
    }
}
