package com.carler.main;

/**
 * @author Caler_赵康乐
 * @create 2020-02-23 18:21
 * @description :
 */
public class Demo1 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i=1;i<200;i++){
            System.out.println(Thread.currentThread().getName()+"----"+ i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();

        d1.setName("AAA");
        d2.setName("BBB");

        d1.start();
        d1.join();//将主线程wait     主线程在此等待，然后d1线程执行完再唤醒主线程

        d2.start();
    }
}
