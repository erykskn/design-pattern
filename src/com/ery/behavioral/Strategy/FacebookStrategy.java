package com.ery.behavioral.Strategy;

public class FacebookStrategy implements ISocialMediaStrategy{
    @Override
    public void connect(String name) {
        System.out.println("Connection with " + name + " through Facebook");
    }
}
