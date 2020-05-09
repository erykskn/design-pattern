package com.ery.creational.factory;

public class SmallCar  extends Car{

    public SmallCar() {
        super(CarType.SMALL);
    }

    @Override
    protected void construct() {
        System.out.println("Building Small Car!");
    }
}
