package com.schatzdesigns.models;

import com.schatzdesigns.Duck;

public class CloudDuck implements Duck {
    @Override
    public String fly() {
        return "High-altitude flying!";
    }

    @Override
    public String walk() {
        return "Never walks";
    }

    @Override
    public String quack() {
        return "Quacks like a tweet!";
    }
}
