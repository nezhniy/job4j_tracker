package ru.job4j.polymorphism;

public interface Transport {
    void drive();

    void passengers(int count);

    default int fuel(int l) {
        return l * 50;
    }
}
