package com.designpatterns;

public class App 
{
    public static void main( String[] args )
    {
        // Instatiating the implementations
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        ConcreteImplementorB concreteImplementorB = new ConcreteImplementorB();

        // Linking one implementation with an abstraction
        // You can use any of the two implementations with any of the two abstractions
        Abstraction abstraction = new Abstraction(concreteImplementorA);
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorB);


        // Linking an abstraction with a client
        // You can use any of the two previous abstraction objects
        Client client = new Client(abstraction);
        client.operation();

        // You can change the implementation or the abstraction during run time
        // I'm going to change just the abstraction, but you can do it with the implementations as well
        client.setAbstraction(refinedAbstraction);
        client.operation();
    }
}
