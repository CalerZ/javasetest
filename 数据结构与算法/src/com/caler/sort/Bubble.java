package com.caler.sort;

import java.util.Arrays;

/**
 * @author Caler_赵康乐
 * @create 2020-04-12 18:19
 * @description :冒泡排序
 */
public class Bubble {


    public static void sort(Comparable[] arr) {
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(compare(arr[j],arr[j+1])){
                    exch(arr,j,j+1);
                }
            }
        }

    }

    /**
     * a是否比b大
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean compare(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 交换索引a与索引b的位置
     *
     * @param arr
     * @param a
     * @param b
     */
    public static void exch(Comparable[] arr, int a, int b) {
        Comparable t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,5,7,3,4,8,1,2,3};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
