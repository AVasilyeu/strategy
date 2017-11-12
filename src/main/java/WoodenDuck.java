package main.java;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flayBehavior = new FlyNoWay();
    }
}
