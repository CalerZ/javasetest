package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-02-29 21:14
 * @description :
 */

import java.util.Scanner;

public class Main{

    /**
     * [-1,-2,-3,-4,-3,-2,-1,6,7,8,9,10]
     *
     * 1-4,6-10
     * @param args
     */
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if(input==null|| "".equals(input)){
            System.out.println("");
        }
        StringBuilder sb = new StringBuilder();
        String[] arrs = input.split(",");

        //不能去重1,2,3,3,3,5,6,7-----1-3,3，3,5-7
         for (int i=0;i<arrs.length;i++){




         }



        String result =sb.toString();
        result = result.substring(0,result.lastIndexOf(","));
        System.out.println(result);


    }

}