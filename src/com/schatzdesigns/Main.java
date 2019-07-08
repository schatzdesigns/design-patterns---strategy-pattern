package com.schatzdesigns;

import com.schatzdesigns.models.Duck;
import com.schatzdesigns.strategies.strategyA.FlyStrategyA;
import com.schatzdesigns.strategies.strategyA.QuackStrategyA;
import com.schatzdesigns.strategies.strategyA.WalkStrategyA;
import com.schatzdesigns.strategies.strategyB.FlyStrategyB;
import com.schatzdesigns.strategies.strategyB.QuackStrategyB;
import com.schatzdesigns.strategies.strategyB.WalkStrategyB;
import com.schatzdesigns.strategies.strategyC.FlyStrategyC;
import com.schatzdesigns.strategies.strategyC.QuackStrategyC;
import com.schatzdesigns.strategies.strategyC.WalkStrategyC;
import com.schatzdesigns.strategies.strategyD.FlyStrategyD;
import com.schatzdesigns.strategies.strategyD.QuackStrategyD;
import com.schatzdesigns.strategies.strategyD.WalkStrategyD;

public class Main {

    public static void main(String[] args) {

        // Implement the different algorithms at run-time

        Duck cityDuck = new Duck(new FlyStrategyA(), new WalkStrategyA(), new QuackStrategyA());
        Duck cloudDuck = new Duck(new FlyStrategyB(), new WalkStrategyB(), new QuackStrategyB());
        Duck mountainDuck = new Duck(new FlyStrategyC(), new WalkStrategyC(), new QuackStrategyC());
        Duck wildDuck = new Duck(new FlyStrategyD(), new WalkStrategyD(), new QuackStrategyD());

        System.out.println();
        System.out.println("City Duck: ");
        System.out.println(cityDuck.fly() + ", " + cityDuck.walk() + ", " + cityDuck.quack());
        System.out.println();
        System.out.println("Cloud Duck: ");
        System.out.println(cloudDuck.fly() + ", " + cloudDuck.walk() + ", " + cloudDuck.quack());
        System.out.println();
        System.out.println("Mountain Duck: ");
        System.out.println(mountainDuck.fly() + ", " + mountainDuck.walk() + ", " + mountainDuck.quack());
        System.out.println();
        System.out.println("Wild Duck: ");
        System.out.println(wildDuck.fly() + ", " + wildDuck.walk() + ", " + wildDuck.quack());
        System.out.println();
    }
}
