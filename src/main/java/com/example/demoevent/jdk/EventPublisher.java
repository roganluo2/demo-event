package com.example.demoevent.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;

/**
 * 事件的发布者
 */
@Data
@AllArgsConstructor
public class EventPublisher {


    private MyEventMulticaster myEventMulticaster;


    public void callback()
    {
        System.out.println("阿里智能审核完成，并且审核通过，准备发布事件");
        StatusChangeEvent event = new StatusChangeEvent(myEventMulticaster);
        event.setId(123);
        event.setStatus(4);
        myEventMulticaster.publishEvent(event);
    }

}
