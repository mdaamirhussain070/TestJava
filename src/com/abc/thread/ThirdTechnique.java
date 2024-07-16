package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class ThirdTechnique {

    public static void main(String[] args) {

        System.out.println("Main Thread start execution ");
        new ThirdTask();

        new ThirdTask();

        System.out.println(" Main Thread end execution ");
    }
}

class ThirdTask implements Runnable{

    private static int count=0;
    private int id;


    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(" Inside rum method "+i);
        }
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
          //  throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
    public ThirdTask(){
        this.id=++count;
        new Thread(this).start();
    }
}