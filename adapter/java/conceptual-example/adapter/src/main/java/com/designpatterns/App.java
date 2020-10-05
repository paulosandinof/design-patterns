package com.designpatterns;

public class App 
{
    public static void main(String[] args)
    {
        // Instantiating the object that is going to be adapted
        Adaptee adaptee = new Adaptee();

        // Linking the adaptee object with an adapter
        // This objects converts the operations of the adaptee to operations that follows the class Target
        Adapter adapter = new Adapter(adaptee);

        // We pass the adapter to the client, and it uses the adapter object to call its methods
        Client client = new Client(adapter);
        client.operation();
    }
}
