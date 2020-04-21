package com.ery.creational;

public class StaticBlockSingleton {
    private static volatile StaticBlockSingleton INSTANCE = null;

    static {
        try{
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }

    public StaticBlockSingleton() {
    }
}
