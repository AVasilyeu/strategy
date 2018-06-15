package main.java;

import main.java.skill.impl.FlyWithWings;

public class RedHatDuck extends Duck {

    public RedHatDuck() {
        flayBehavior = new FlyWithWings();
    }
}
