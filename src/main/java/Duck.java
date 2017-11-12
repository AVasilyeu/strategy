package main.java;

public abstract class Duck {
    FlayBehavior flayBehavior;

    public Duck(FlayBehavior flayBehavior) {
        this.flayBehavior = flayBehavior;
    }

    public void getInfo() {
        System.out.println("I am main.java.Duck.");
    }

    public void fly() {
        flayBehavior.performFly();
    }
}