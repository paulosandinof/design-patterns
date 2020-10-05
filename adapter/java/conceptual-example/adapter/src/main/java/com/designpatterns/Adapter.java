package com.designpatterns;

public class Adapter extends Target {
    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        String string = this.adaptee.specificRequest();

        StringBuffer stringBuffer = new StringBuffer(string);

        String result = new String(stringBuffer.reverse());

        return "Adapter: (TRANSLATED) " + result;
    }
}
