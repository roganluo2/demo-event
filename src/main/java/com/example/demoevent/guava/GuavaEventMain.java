package com.example.demoevent.guava;

public class GuavaEventMain {

    public static void main(String[] args) throws InterruptedException {
        GuavaEventMulticaster multicaster = new GuavaEventMulticaster();
        System.out.println("接收到阿里的回调函数");
        GuavaEventPublisher service = new GuavaEventPublisher(multicaster);
        //执行service回调方法
        service.callback();

    }
}
