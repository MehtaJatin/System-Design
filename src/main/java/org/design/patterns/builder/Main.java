package org.design.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleBuilder.builder()
                .setBreaks("abc")
                .setTyre("def")
                .build();

        System.out.println(vehicle);


    }
}
