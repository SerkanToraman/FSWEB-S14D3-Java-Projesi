package com.WorkintechS18G3.pacificcarcompany;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "the car is braking";
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Cylinders: " + cylinders + "\n");
        return builder.toString();
    }
    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null || getClass() != o. getClass()) return false;
        return ((Car)o).cylinders == cylinders&& ((Car)o).name.equals(name);
    }
}

