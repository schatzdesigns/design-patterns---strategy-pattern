package com.schatzdesigns.models;

import com.schatzdesigns.Duck;

public class WildDuck implements Duck {
    @Override
    public String fly() {
        return "Wild flying!";
    }

    @Override
    public String walk() {
        return "Walks wildly";
    }

    @Override
    public String quack() {
        return "Wild quacking!";
    }
}
