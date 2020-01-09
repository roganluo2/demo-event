package com.example.demoevent.springboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootApplicationEventBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootApplicationEventBootstrap.class).listeners(event -> System.out.println("接收到SpringBoot事件：" + event.getClass().getSimpleName()))
                .web(WebApplicationType.NONE)
                .run(args)
                .close();
    }

}
