package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class FirstTechnique {
    public static void main(String[] args) {
        System.out.println("Main Thread start Execution ");

        new FirstTask();
        Thread t=new FirstTask();
        t.start();
        System.out.println("Main Thread ended Execution");

    }
}
class FirstTask extends Thread{

    private static int count=0;
    private int id;
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(id+" Inside run method "+i);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}