package ru.job4j.cast;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Train traveling on rails");
    }
}
