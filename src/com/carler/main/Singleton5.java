package com.carler.main;

/**
 * @author Caler_赵康乐
 * @create 2020-02-22 11:46
 * @description :线程安全的懒汉式单例模式
 */
public class Singleton5 {

    private static Singleton5 instance;
    private Singleton5(){};
    public static Singleton5 getInstance(){
        if(instance==null){
            synchronized (Singleton5.class){
                if(instance==null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
