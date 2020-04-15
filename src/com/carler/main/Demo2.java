package com.carler.main;

/**
 * @author Caler_赵康乐
 * @create 2020-02-23 18:29
 * @description :
 */
public class Demo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Demo2());
        t1.start();
        Thread t2 = new Thread(new Demo2());
        t2.start();


        //匿名类
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName() + "----" + i);
                }
            }
        });
        t3.start();

        //可以简写
        new Thread(
                () -> {
                    for (int i = 1; i < 200; i++) {
                        System.out.println(Thread.currentThread().getName() + "----" + i);
                    }
                }).start();


    }
}
