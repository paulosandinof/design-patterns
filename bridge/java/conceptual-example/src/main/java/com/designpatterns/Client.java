package com.designpatterns;

public class Client {
    private Abstraction abstraction;

    public Client(Abstraction abstraction) {
        this.abstraction = abstraction;
    }

    public void setAbstraction(Abstraction abstraction) {
        this.abstraction = abstraction;
    }

    public void operation() {
        System.out.println(abstraction.operation());
    }
}
