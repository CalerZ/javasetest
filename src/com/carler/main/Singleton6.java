package com.carler.main;

/**
 * @author Caler_赵康乐
 * @create 2020-02-22 11:49
 * @description :
 */
public class Singleton6 {
    private Singleton6(){}
    private static class Inner{
       static Singleton6  instance = new Singleton6();
    }
    public static Singleton6 getInstance(){
       return  Inner.instance;
    }
}
