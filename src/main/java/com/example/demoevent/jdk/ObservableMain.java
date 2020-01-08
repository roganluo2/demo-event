package com.example.demoevent.jdk;

import java.util.Observable;
import java.util.concurrent.TimeUnit;

public class ObservableMain {

    public static void main(String[] args) throws InterruptedException {
        //初始化完成，注册监听者
        MyEventMulticaster myEventMulticaster = new MyEventMulticaster();
        myEventMulticaster.addObserver(new YiDunCheckEventListener());

        TimeUnit.SECONDS.sleep(3);
        System.out.println("接收到阿里的回调");
        EventPublisher service = new EventPublisher(myEventMulticaster);
        //执行service回调方法
        service.callback();


    }
}
