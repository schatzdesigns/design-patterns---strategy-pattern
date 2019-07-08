package com.schatzdesigns.strategies.strategyD;

import com.schatzdesigns.strategies.interfaces.IQuackStrategy;

public class QuackStrategyD implements IQuackStrategy {
    @Override
    public String quack() {
        return "Quacks wildly!";
    }
}
