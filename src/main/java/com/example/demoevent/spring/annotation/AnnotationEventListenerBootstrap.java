package com.example.demoevent.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationEventListenerBootstrap {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.demoevent.spring.annotation");
        VideoService service = context.getBean(VideoService.class);
        service.callback();
        context.close();

    }

}
