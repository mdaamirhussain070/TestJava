package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class LoopTaskB implements Runnable{

    private static int count=0;
    private int instanceNumber;
    private String taskId;
    @Override
    public void run() {
        Thread.currentThread().setName("Worker"+instanceNumber);
        String currentThread=Thread.currentThread().getName();
        System.out.println("############# ID "+taskId +"STARTING ######");
        for (int i=0;i<10;i++){
            System.out.println(taskId+" Inside run method "+i);

            try {
                TimeUnit.MILLISECONDS.sleep((long) Math.random()*1000);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        System.out.println("********************["+currentThread+"]+++["+taskId+"]*****");
        System.out.println("############# ID "+taskId +"ENDING ######");
    }
    public LoopTaskB(){
        this.instanceNumber=++count;
        this.taskId="LoopTaskB"+instanceNumber;
    }

}
