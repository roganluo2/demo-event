package com.example.demoevent.guava;

import com.google.common.eventbus.EventBus;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Observable;

/**
 * 事件发布器/广播器
 */
public class GuavaEventMulticaster {



    public void publishEvent(EventObject eventObject)
    {
        System.out.println("guava开始发布事件:" + eventObject.toString());
        EventBus eventBus = new EventBus();
        EventListener eventListener = new YiDunCheckEventListener();
        eventBus.register(eventListener);
        eventBus.post(eventObject);
    }

}
