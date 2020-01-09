package com.example.demoevent.guava;

import com.example.demoevent.jdk.StatusChangeEvent;
import com.google.common.eventbus.Subscribe;

import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;

/**
 * 易盾审核事件监听器
 */
public class YiDunCheckEventListener implements EventListener {

    @Subscribe
    public void subscribe(StatusChangeEvent event) {
        if(event.getStatus() == 4)
        {
            System.out.printf("阿里智能审核已经完成，开始对视频[ID:%d]开启易盾审核", event.getId());
        }
    }
}
