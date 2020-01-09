package com.example.demoevent.guava;

import lombok.Data;

import java.util.EventObject;

/**
 * 状态改变事件
 */
@Data
public class StatusChangeEvent extends EventObject {

    private int status;

    private int id;

    public StatusChangeEvent(GuavaEventMulticaster guavaEventPublisher) {
        super(guavaEventPublisher);
    }


}
