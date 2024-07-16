package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class FifthTechnique {

    public static void main(String[] args) {

        System.out.println(" Main Thread start execution");

        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Inside run method "+i);
                    try {
                        TimeUnit.MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t.start();
        System.out.println(" Main Thread end execution");
    }
}
