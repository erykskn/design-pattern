package com.ery.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        SubscriberOne one = new SubscriberOne();
        SubscriberTwo two = new SubscriberTwo();
        SubscriberThree three = new SubscriberThree();

        MessagePublisher publisher = new MessagePublisher();

        publisher.attach(one);
        publisher.attach(two);
        publisher.notifyUpdate(new Message("First Message"));

        publisher.detach(one);
        publisher.attach(three);

        publisher.notifyUpdate(new Message("Second Message"));

    }
}
