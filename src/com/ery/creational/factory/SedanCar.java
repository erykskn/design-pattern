package com.ery.creational.factory;

public class SedanCar extends Car{

    public SedanCar() {
        super(CarType.SEDAN);
    }

    @Override
    protected void construct() {
        System.out.println("Building Sedan Car!");
    }
}
