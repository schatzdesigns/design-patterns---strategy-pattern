package com.schatzdesigns.strategies.strategyC;

import com.schatzdesigns.strategies.interfaces.IQuackStrategy;

public class QuackStrategyC implements IQuackStrategy {
    @Override
    public String quack() {
        return "Quacks like a mountain bear!";
    }
}
