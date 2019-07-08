package com.schatzdesigns.strategies.strategyA;

import com.schatzdesigns.strategies.interfaces.IQuackStrategy;

public class QuackStrategyA implements IQuackStrategy {
    @Override
    public String quack() {
        return "White collar quacking!";
    }
}
