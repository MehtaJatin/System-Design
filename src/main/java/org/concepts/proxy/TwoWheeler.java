package org.concepts.proxy;

public class TwoWheeler implements Vehicle {

    public TwoWheeler() {
        assembleTyre();
        assembleBrakes();
    }

    public void assembleTyre() {
        System.out.println("Tyre assembled");
    }

    public void assembleBrakes() {
        System.out.println("Brakes assembled");
    }

    @Override
    public void assemble() {
        System.out.println("Two wheeler assembled");
    }
}
