package com.example.demoevent.spring.annotation;

import com.example.demoevent.spring.inherit.StatusChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


/**
 * 易盾审核事件监听器
 */
@Component
public class YiDunCheckEventListener {

    @EventListener
    public void onApplicationEvent(StatusChangeEvent event) {
        if(event.getStatus() == 4)
        {
            System.out.printf("阿里智能审核已经完成，开始对视频[ID:%d]开启易盾审核", event.getId());
        }
    }
}
