package main.java;

public class FlyNoWay implements FlayBehavior {
    @Override
    public void performFly() {
        System.out.println("I can't fly!");
    }
}
