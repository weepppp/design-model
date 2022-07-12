package com.tang.structuralmode.adaptermode;

/**
 * @author weepppp 2022/7/12 8:31
 **/
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void adapteeMethod() {
       adaptee.adapteeMethod();
    }

    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
