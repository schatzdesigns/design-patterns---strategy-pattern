package com.schatzdesigns.strategies.strategyC;

import com.schatzdesigns.strategies.interfaces.IFlyStrategy;

public class FlyStrategyC implements IFlyStrategy {
    @Override
    public String fly() {
        return "High-altitude flying!";
    }
}
