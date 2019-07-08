package com.schatzdesigns;

import com.schatzdesigns.models.CityDuck;

public class Main {

    public static void main(String[] args) {
        Duck cityDuck = new CityDuck();
        System.out.println(cityDuck.fly());
        System.out.println(cityDuck.walk());
        System.out.println(cityDuck.quack());
    }
}
