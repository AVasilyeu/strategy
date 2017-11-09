package main.java;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RedHatDuck(new FlyWithWings());
        Duck newDuck = new WoodenDuck(new FlyNoWay());
        duck.fly();
        newDuck.fly();
    }
}
