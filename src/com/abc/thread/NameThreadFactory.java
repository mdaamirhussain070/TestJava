package com.abc.thread;

import java.util.concurrent.ThreadFactory;

public class NameThreadFactory implements ThreadFactory {
    private  static int count=0;
    private static String name="Poolworker-";
    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread(r,name + ++count);
        return t;
    }
}
