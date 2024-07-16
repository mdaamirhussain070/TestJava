package com.abc.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NamingExecutorThread {

    public static void main(String[] args) {
        System.out.println("Main Thread starting");

        ExecutorService executorService= Executors.newCachedThreadPool(new NameThreadFactory());
        for (int i=0;i<3;i++){
            executorService.execute(new LoopTaskC());
        }
        executorService.shutdown();
        System.out.println(" Main Thread ended");
    }
}
