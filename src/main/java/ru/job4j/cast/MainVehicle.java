package ru.job4j.cast;

public class MainVehicle {
    public static void main(String[] args) {
        Train train = new Train();
        Bus bus = new Bus();
        Plane plane = new Plane();
        Vehicle trainV = train;
        Vehicle busV = bus;
        Vehicle planeV = plane;

        Vehicle[] vehicles = new Vehicle[]{trainV, busV, planeV};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
