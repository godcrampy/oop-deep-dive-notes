package com.godcrampy.oop_deep_dive.vehicle;

public class Car {
    private final String name;
    private final String color;
    private final Integer peopleCapacity;
    private Integer fuelLeft;
    private Integer distanceTravelled;

    public Car(String name, String color, Integer peopleCapacity) {
        this.name = name;
        this.color = color;
        this.peopleCapacity = peopleCapacity;
        this.fuelLeft = 100;
        this.distanceTravelled = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getPeopleCapacity() {
        return peopleCapacity;
    }

    public Integer getFuelLeft() {
        return fuelLeft;
    }

    public Integer getDistanceTravelled() {
        return distanceTravelled;
    }

    private void checkSystems() {
        System.out.println("Checking Systems...");
    }

    public void startEngine() {
        checkSystems();
        System.out.println("Starting Engine!");
    }

    public void refuelTank(int fuel) {
        fuelLeft += fuel;
    }

    public void drive(int distance) {
        System.out.println("Driving...");
        distanceTravelled += distance;
    }
}
