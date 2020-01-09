package com.example.demoevent.spring.annotation;

import com.example.demoevent.spring.inherit.StatusChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * 事件的发布者
 */
@Service
public class VideoService {

    /**
     * 也可以通过autowire的方式注入
     */
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    public void callback()
    {
        System.out.println("阿里智能审核完成，并且审核通过，准备发布事件");
        StatusChangeEvent event = new StatusChangeEvent(this);
        event.setId(123);
        event.setStatus(4);
        applicationEventPublisher.publishEvent(event);
    }

}
