package com.caler.sort;

import java.util.Arrays;

/**
 * @author Caler_赵康乐
 * @create 2020-04-13 16:07
 * @description :希尔排序
 */
public class Shell {

    public static void sort(Comparable[] arr) {
        int h=0;
        while(h<(arr.length/2)){
            h=2*h+1;
        }

        while (h!=1){
            //间隔为h的插入排序
            for (int i = 0; i < arr.length; i+=h) {
                for(int j=i;j>h;j-=h){
                    if(compare(arr[j-h],arr[j])){
                        exch(arr,j-h,j);
                    }
                }
            }
            h=h/2;
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
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
