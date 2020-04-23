package com.ery.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher  implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        System.out.println("Attaching subscriber: " +observer.getClass().getSimpleName());
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        System.out.println("Detaching subscriber: " +observer.getClass().getSimpleName());
        observerList.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observerList){
            observer.update(message);
        }
    }
}
