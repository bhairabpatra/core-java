package org.exception.handel.abs;

public class Car implements Vehicle {
    @Override
    public void details() {
        System.out.println("This is CAR");
    }
    public static void main(String[] args) {
        Car car = new Car();
        Scooter scooter = new Scooter();
        scooter.details();
        car.details();
    }
}

class Scooter implements Vehicle {
    @Override
    public void details() {
        System.out.println("This is Scooter");
    }
}
