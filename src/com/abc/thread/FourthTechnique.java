package com.abc.thread;

import java.util.concurrent.TimeUnit;

public class FourthTechnique {
    public static void main(String[] args) {

        System.out.println(" Main Thread start execution ");
      //  new FourthTask();

        new Thread(new FourthTask()).start();

        Thread t=new Thread(new FourthTask());
        t.start();

        System.out.println(" Main Thread end execution ");


    }
}
class  FourthTask implements Runnable{

    private  static int count=0;
    private int id;

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(id+"  Inside run method "+i);

            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }

    public FourthTask(){
        this.id=++count;
        //new Thread(this).start();
    }
}