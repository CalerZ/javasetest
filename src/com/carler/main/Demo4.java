package com.carler.main;

import java.util.concurrent.*;

/**
 * @author Caler_赵康乐
 * @create 2020-02-23 22:17
 * @description :
 */
public class Demo4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> f =  service.submit((Callable<String>)()->{
            for (int i = 1; i < 200; i++) {
                System.out.println(Thread.currentThread().getName() + "----" + i);
            }
            return Thread.currentThread().getName() + "----" ;
        });
        String s = f.get();
        System.out.println(s);
        service.shutdown();

    }


}
