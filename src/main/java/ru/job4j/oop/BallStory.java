package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hair hair = new Hair();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hair.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
