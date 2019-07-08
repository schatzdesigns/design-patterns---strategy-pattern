package com.schatzdesigns.models;

import com.schatzdesigns.Duck;

public class MountainDuck implements Duck {
    @Override
    public String fly() {
        return "High-altitude flying!";
    }

    @Override
    public String walk() {
        return "Hops around";
    }

    @Override
    public String quack() {
        return "Quacks like a mountain bear!";
    }
}
