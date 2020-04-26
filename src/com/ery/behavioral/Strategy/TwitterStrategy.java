package com.ery.behavioral.Strategy;

public class TwitterStrategy implements ISocialMediaStrategy {
    @Override
    public void connect(String name) {
        System.out.println("Connection with " + name + " through Twitter");
    }
}
