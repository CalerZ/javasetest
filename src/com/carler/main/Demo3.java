package com.carler.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author Caler_赵康乐
 * @create 2020-02-23 21:37
 * @description :
 */
public class Demo3 {

    public static void main(String[] args) {
        try {
            FutureTask<Integer> f = new FutureTask((Callable<Integer>) () -> 10);
            new Thread(f).start();

            Integer integer = f.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
