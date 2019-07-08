package com.schatzdesigns.strategies.strategyC;

import com.schatzdesigns.strategies.interfaces.IWalkStrategy;

public class WalkStrategyC implements IWalkStrategy {
    @Override
    public String walk() {
        return "Hops around!";
    }
}
