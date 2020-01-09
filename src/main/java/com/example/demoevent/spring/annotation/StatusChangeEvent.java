package com.example.demoevent.spring.annotation;

import lombok.Data;
import org.springframework.context.ApplicationEvent;


/**
 * 状态改变事件
 */
@Data
public class StatusChangeEvent extends ApplicationEvent {

    private int status;

    private int id;

    public StatusChangeEvent(Object source) {
        super(source);
    }
}
