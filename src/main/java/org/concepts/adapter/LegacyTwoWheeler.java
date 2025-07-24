package org.concepts.adapter;

public class LegacyTwoWheeler implements LegacyVehicle{
    @Override
    public void assemble(String tyre) {
        System.out.println("Assembling two wheeler");
    }
}
