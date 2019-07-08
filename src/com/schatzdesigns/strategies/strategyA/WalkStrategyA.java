package com.schatzdesigns.strategies.strategyA;

import com.schatzdesigns.strategies.interfaces.IWalkStrategy;

public class WalkStrategyA implements IWalkStrategy {
    @Override
    public String walk() {
        return "Walks casually!";
    }
}
