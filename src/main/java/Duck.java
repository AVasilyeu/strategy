package main.java;

public abstract class Duck {
    Flyable flyable;

    public Duck(Flyable flyable) {
        this.flyable = flyable;
    }

    public void getInfo() {
        System.out.println("I am main.java.Duck.");
    }

    public void fly() {
        flyable.performFly();
    }
}
