package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable{

    private static int count=0;
    private int id;

    @Override
    public void run() {
        System.out.println("############# ID "+id +"STARTING ######");
        for (int i=0;i<10;i++){
            System.out.println(id+" Inside run method "+i);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        System.out.println("############# ID "+id +"ENDING ######");
    }
    public LoopTaskA(){
        this.id=++count;
    }
}
