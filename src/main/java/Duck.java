package main.java;

public abstract class Duck {
    FlayBehavior flayBehavior;

    public Duck() {
    }

    public void getInfo() {
        System.out.println("I am Duck.");
    }

    public void fly() {
        flayBehavior.performFly();
    }
}