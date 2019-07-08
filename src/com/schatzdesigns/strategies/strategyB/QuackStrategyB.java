package com.schatzdesigns.strategies.strategyB;

import com.schatzdesigns.strategies.interfaces.IQuackStrategy;

public class QuackStrategyB implements IQuackStrategy {
    @Override
    public String quack() {
        return "Quacks like a tweet!";
    }
}
