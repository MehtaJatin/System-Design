package org.concepts.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass object1 = SingletonClass.getInstance();
        SingletonClass object2 = SingletonClass.getInstance();
        System.out.println(object1.equals(object2));


        Thread thread1 = new Thread(() -> {
            SingletonClass object3 = SingletonClass.getInstance();
            System.out.println(object3);
        });

        Thread thread2 = new Thread(() -> {
            SingletonClass object4 = SingletonClass.getInstance();
            System.out.println(object4);
        });

        thread1.start();
        thread2.start();
    }
}
