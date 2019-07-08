package com.schatzdesigns.strategies.strategyD;

import com.schatzdesigns.strategies.interfaces.IFlyStrategy;

public class FlyStrategyD implements IFlyStrategy {
    @Override
    public String fly() {
        return "Wild flying!";
    }
}
