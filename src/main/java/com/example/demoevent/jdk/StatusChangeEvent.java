package com.example.demoevent.jdk;

import lombok.Data;

import java.util.EventObject;
import java.util.Observable;

/**
 * 状态改变事件
 */
@Data
public class StatusChangeEvent extends EventObject {

    private int status;

    private int id;

    public StatusChangeEvent(Observable observable) {
        super(observable);
    }


}
