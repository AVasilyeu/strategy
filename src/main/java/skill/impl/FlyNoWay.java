package main.java.skill.impl;

import main.java.skill.FlayBehavior;

public class FlyNoWay implements FlayBehavior {
    @Override
    public void performFly() {
        System.out.println("I can't fly!");
    }
}
