package com.godcrampy.oop_deep_dive;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "Red", 4);

        honda.startEngine();

        System.out.println(honda.fuelLeft);
        honda.refuelTank(100);
        System.out.println(honda.fuelLeft);

        System.out.println(honda.distanceTravelled);
        honda.drive(10);
        System.out.println(honda.distanceTravelled);
    }
}
