package com.ery.creational.singleton;

public class EagerSingleton {

    private static volatile EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return singleton;
    }
}
