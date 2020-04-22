package com.ery.creational.prototype;

public class Movie implements PrototypeCapable {
    private String name = null;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie object!");
        return (Movie)super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
