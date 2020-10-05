package com.designpatterns;

public class Abstraction {
    protected Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public String operation() {
        String result = this.implementation.operationImplementation();
        return "Abstraction: Base operation with: " + result;
    }
}
