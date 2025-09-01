package org.design.patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
       Client client = new Client(new SedanVehicleFactory());
       client.getFourWheeler().printName();
       client.getTwoWheeler().printName();

        Client client2 = new Client(new MarutiVehicleFactory());
        client2.getFourWheeler().printName();
        client2.getTwoWheeler().printName();

    }
}
