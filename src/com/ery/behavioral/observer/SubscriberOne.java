package com.ery.behavioral.observer;

public class SubscriberOne implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Subscriber One , message: " + m.getMessageContent());
    }
}
