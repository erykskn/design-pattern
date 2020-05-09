package com.ery.creational.factory;

public abstract class Car {
    private CarType carType;

    public Car(CarType carType){
        this.carType = carType;
        construct();
    }

    protected abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
