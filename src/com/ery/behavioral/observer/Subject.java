package com.ery.behavioral.observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyUpdate(Message message);
}
