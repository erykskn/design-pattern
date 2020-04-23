package com.ery.behavioral.observer;

public class SubscriberThree  implements Observer{
    @Override
    public void update(Message m) {
        System.out.println("Subscriber Three, message:" + m.getMessageContent());
    }
}
