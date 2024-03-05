package ru.job4j.cast;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle trainV = new Train();
        Vehicle busV = new Bus();
        Vehicle planeV = new Plane();

        Vehicle[] vehicles = new Vehicle[]{trainV, busV, planeV};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
