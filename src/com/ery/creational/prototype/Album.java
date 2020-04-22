package com.ery.creational.prototype;

public class Album implements PrototypeCapable {
    private String name = null;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning album object..");
        return (Album)super.clone();
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }
}
