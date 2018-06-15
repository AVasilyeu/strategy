package main.java.skill.impl;

import main.java.skill.FlayBehavior;

public class FlyWithWings implements FlayBehavior {
    @Override
    public void performFly() {
        System.out.println("I am fly!");
    }
}
