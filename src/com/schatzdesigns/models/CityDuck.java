package com.schatzdesigns.models;

import com.schatzdesigns.Duck;

public class CityDuck implements Duck {
    @Override
    public String fly() {
        return "High-intensity flying!";
    }

    @Override
    public String walk() {
        return "Walks casually!";
    }

    @Override
    public String quack() {
        return "White collar quacking!";
    }
}
