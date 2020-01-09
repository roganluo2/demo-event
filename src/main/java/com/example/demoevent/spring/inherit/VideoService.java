package com.example.demoevent.spring.inherit;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * 事件的发布者
 */
@Service
public class VideoService implements ApplicationEventPublisherAware {


    private ApplicationEventPublisher applicationEventPublisher;


    public void callback()
    {
        System.out.println("阿里智能审核完成，并且审核通过，准备发布事件");
        StatusChangeEvent event = new StatusChangeEvent(this);
        event.setId(123);
        event.setStatus(4);
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
