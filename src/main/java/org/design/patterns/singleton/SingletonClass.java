package org.design.patterns.singleton;

public class SingletonClass {
    private static volatile SingletonClass singletonClass;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    singletonClass = new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
