package com.schatzdesigns.strategies.strategyB;

import com.schatzdesigns.strategies.interfaces.IWalkStrategy;

public class WalkStrategyB implements IWalkStrategy {
    @Override
    public String walk() {
        return "Never Walks!";
    }
}
