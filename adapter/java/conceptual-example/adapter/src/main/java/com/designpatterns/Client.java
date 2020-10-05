package com.designpatterns;

public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void operation() {
        System.out.println(target.request());
    }
}
