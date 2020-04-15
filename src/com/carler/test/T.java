package com.carler.test;

import java.util.concurrent.TimeUnit;

/**
 * @author Caler_赵康乐
 * @create 2020-04-08 8:59
 * @description :
 */
public class T implements Runnable {

    private int count = 10;

    public synchronized void run() {
        count--;
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        T t = new T();
        for(int i=0; i<5; i++) {

            new Thread(t, "THREAD" + i).start();
        }
    }

}