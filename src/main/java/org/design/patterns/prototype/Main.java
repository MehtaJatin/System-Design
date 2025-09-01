package org.design.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new TwoWheeler("abc", "def");
        Vehicle twoWheeler = vehicle.clone();
        System.out.println(twoWheeler);
    }
}
