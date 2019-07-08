package com.schatzdesigns.strategies.strategyA;

import com.schatzdesigns.strategies.interfaces.IFlyStrategy;

public class FlyStrategyA implements IFlyStrategy {
    @Override
    public String fly() {
        return "High-intensity flying!";
    }
}
