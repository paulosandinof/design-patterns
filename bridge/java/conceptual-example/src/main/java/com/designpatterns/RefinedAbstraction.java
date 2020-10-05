package com.designpatterns;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public String operation() {
        String result = this.implementation.operationImplementation();
        return "RefinedAbstraction: Refined operation with: " + result;
    }
}