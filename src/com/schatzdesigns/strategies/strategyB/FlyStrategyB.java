package com.schatzdesigns.strategies.strategyB;

import com.schatzdesigns.strategies.interfaces.IFlyStrategy;

public class FlyStrategyB implements IFlyStrategy {
    @Override
    public String fly() {
        return "High-altitude flying!";
    }
}
