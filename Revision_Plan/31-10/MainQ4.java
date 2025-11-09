// Q4: Vehicle + Interface Startable
abstract class Vehicle {
    abstract void fuelType();
}

interface Startable {
    void start();
}

class Car extends Vehicle implements Startable {
    void fuelType() {
        System.out.println("Car uses Petrol or Diesel.");
    }

    public void start() {
        System.out.println("Car started with key ignition.");
    }
}

class Bike extends Vehicle implements Startable {
    void fuelType() {
        System.out.println("Bike uses Petrol.");
    }

    public void start() {
        System.out.println("Bike started with self-start button.");
    }
}

public class MainQ4 {
    public static void main(String[] args) {
        Startable car = new Car();
        ((Car) car).fuelType();
        car.start();

        Startable bike = new Bike();
        ((Bike) bike).fuelType();
        bike.start();
    }
}
