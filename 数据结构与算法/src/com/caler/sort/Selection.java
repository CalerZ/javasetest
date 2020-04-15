package com.caler.sort;

import java.util.Arrays;

/**
 * @author Caler_赵康乐
 * @create 2020-04-12 18:33
 * @description :快速排序
 */
public class Selection {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i <arr.length -1; i++) {//剩下一位不用进行快速排序
            int minIndex = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(compare(arr[minIndex],arr[j])){
                    minIndex=j;
                }

            }
            exch(arr,i,minIndex);

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
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
