package com.carler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-05 19:58
 * @description :
 *
 *
 * s1 = AABCD, s2 = CDAA
 * Return : true
 * 给定两个字符串 s1 和 s2，要求判定 s2 是否能够被 s1 做循环移位得到的字符串包含。
 *
 *s1 进行循环移位的结果是 s1s1 的子字符串，因此只要判断 s2 是否是 s1s1 的子字符串即可。
 */
public class Solution10 {
    public static void main(String[] args) {
        System.out.println(cycleChar("AABCD", "CDAA"));
    }

    public static boolean cycleChar(String s1,String s2){
        String temp = s1+s1;
        if(temp.contains(s2)){
            return true;
        }else{
            return  false;
        }
    }

}
