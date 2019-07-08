package com.schatzdesigns.models;

import com.schatzdesigns.strategies.interfaces.IFlyStrategy;
import com.schatzdesigns.strategies.interfaces.IQuackStrategy;
import com.schatzdesigns.strategies.interfaces.IWalkStrategy;

public class Duck implements IDuck {

    private IFlyStrategy iFlyStrategy;
    private IWalkStrategy iWalkStrategy;
    private IQuackStrategy iQuackStrategy;

    // We dependency inject the different strategies/algorithms (Family of algorithms).

    public Duck(IFlyStrategy flyStrategy, IWalkStrategy walkStrategy, IQuackStrategy quackStrategy) {
        iFlyStrategy = flyStrategy;
        iWalkStrategy = walkStrategy;
        iQuackStrategy = quackStrategy;
    }

    // Delegate to the instance variables.

    @Override
    public String fly() {
        return this.iFlyStrategy.fly();
    }

    @Override
    public String walk() {
        return this.iWalkStrategy.walk();
    }

    @Override
    public String quack() {
        return this.iQuackStrategy.quack();
    }
}
