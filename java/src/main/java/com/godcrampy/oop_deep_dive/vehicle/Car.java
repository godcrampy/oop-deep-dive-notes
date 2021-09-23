package com.godcrampy.oop_deep_dive.vehicle;

public class Car {
    private String name;
    private String color;
    private Integer peopleCapacity;
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

    public Integer getDistanceTravelled() {
        return distanceTravelled;
    }

    public Integer getFuelLeft() {
        return fuelLeft;
    }

    private void checkSystem() {
        System.out.println("Checking System....");
    }

    public void startEngine() {
        checkSystem();
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
