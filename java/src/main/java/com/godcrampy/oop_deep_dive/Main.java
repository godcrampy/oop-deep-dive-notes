package com.godcrampy.oop_deep_dive;

import com.godcrampy.oop_deep_dive.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", "Red", 4);

        honda.startEngine();

        System.out.println(honda.getFuelLeft());
        honda.refuelTank(100);
        System.out.println(honda.getFuelLeft());

        System.out.println(honda.getDistanceTravelled());
        honda.drive(10);
        System.out.println(honda.getDistanceTravelled());
    }
}
