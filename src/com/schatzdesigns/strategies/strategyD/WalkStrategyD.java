package com.schatzdesigns.strategies.strategyD;

import com.schatzdesigns.strategies.interfaces.IWalkStrategy;

public class WalkStrategyD implements IWalkStrategy {
    @Override
    public String walk() {
        return "Walks wildly!";
    }
}
