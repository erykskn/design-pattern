package com.ery.creational.singleton;

public class InnerStaticClassSingleton {

    private static class InnerClass {
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance(){
        return InnerClass.INSTANCE;
    }
}
