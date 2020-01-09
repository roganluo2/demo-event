package com.example.demoevent.spring.inherit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationListenerBootstrap {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.demoevent.spring.inherit");
        VideoService service = context.getBean(VideoService.class);
        service.callback();
        context.close();

    }

}
