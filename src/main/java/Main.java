package main.java;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RedHatDuck();
        Duck newDuck = new WoodenDuck();
        duck.fly();
        newDuck.fly();
    }
}
