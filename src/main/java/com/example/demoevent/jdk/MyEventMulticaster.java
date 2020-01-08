package com.example.demoevent.jdk;

import java.util.EventObject;
import java.util.Observable;

/**
 * 事件发布器/广播器
 */
public class MyEventMulticaster extends Observable {

    public void publishEvent(EventObject eventObject)
    {
        setChanged();
        notifyObservers(eventObject);
    }

}
