package com.ery.behavioral.observer;

public class SubscriberTwo implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Subscriber Two, message: " + m.getMessageContent());
    }
}
