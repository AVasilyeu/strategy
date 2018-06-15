package main.java;

import main.java.skill.impl.FlyNoWay;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flayBehavior = new FlyNoWay();
    }
}
