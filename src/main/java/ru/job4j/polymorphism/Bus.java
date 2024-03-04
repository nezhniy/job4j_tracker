package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus goes");
    }

    @Override
    public void passengers(int count) {
        System.out.println("count = " + count);
    }

    @Override
    public int fuel(int l) {
        return Transport.super.fuel(l);
    }
}
