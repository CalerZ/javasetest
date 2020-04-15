package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-02 14:25
 * @description :
 *
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 */
public class Solution6 {

    public static void main(String[] args) {
        System.out.println(isPalindrome1(11));
    }

    public static boolean isPalindrome(int x) {

        String num = x+"";
        if(num.length()%2==0){
            String prix = num.substring(0,num.length()/2);
            String end = num.substring(num.length()/2);
            if(new StringBuilder(prix).reverse().toString().equals(end)){
                return true;
            }else{
                return false;
            }
        }else{
            String prix = num.substring(0,num.length()/2);
            String end = num.substring(num.length()/2 +1);
            if(new StringBuilder(prix).reverse().toString().equals(end)){
                return true;
            }else{
                return false;
            }

        }

    }

    /**反转一半数字
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {

        /**
         * 0是回文
         * 10不是回文 且末尾带有0的数字不是回文
         * 负数不是回文
         */
        if(x<0 || (x%10==0&&x!=0)){
            return false;
        }

        int n=0;
        while(x>=n){
            int pop =x%10;
            n = n*10+pop;

            if(n==x)
                return true;
            x=x/10;

        }
        return false;
    }

}
