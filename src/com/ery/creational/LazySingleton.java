package com.ery.creational;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){ //double check
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
