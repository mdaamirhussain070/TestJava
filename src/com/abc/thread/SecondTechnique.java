package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class SecondTechnique {

    public static void main(String[] args) {
        System.out.println("Main Thread start execution ");
        new SecondTask().start();

        Thread t=new SecondTask();
        t.start();
        System.out.println(" Main Thread end execution ");
    }
}

class SecondTask extends Thread{

    private static int count=0;
    private int id;

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(id+"  Inside run method "+i);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
             //   throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }
    public SecondTask(){
        this.id=++count;
    }

}