package com.godcrampy.oop_deep_dive;

public class Car {
    String name;
    String color;
    Integer peopleCapacity;
    Integer fuelLeft;
    Integer distanceTravelled;

    public Car(String name, String color, Integer peopleCapacity) {
        this.name = name;
        this.color = color;
        this.peopleCapacity = peopleCapacity;
        this.fuelLeft = 100;
        this.distanceTravelled = 0;
    }

    void startEngine() {
        System.out.println("Starting Engine!");
    }

    void refuelTank(int fuel) {
        fuelLeft += fuel;
    }

    void drive(int distance) {
        System.out.println("Driving...");
        distanceTravelled += distance;
    }
}
