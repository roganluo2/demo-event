package com.example.demoevent.guava;

import com.example.demoevent.jdk.MyEventMulticaster;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 事件的发布者
 */
@Data
@AllArgsConstructor
public class GuavaEventPublisher {


    private GuavaEventMulticaster guavaEventMulticaster;


    public void callback()
    {
        System.out.println("阿里智能审核完成，并且审核通过，准备发布事件");
        StatusChangeEvent event = new StatusChangeEvent(guavaEventMulticaster);
        event.setId(123);
        event.setStatus(4);
        guavaEventMulticaster.publishEvent(event);
    }

}
