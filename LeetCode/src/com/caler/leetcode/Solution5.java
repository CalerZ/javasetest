package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-02 13:39
 * @description :
 *
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，
 * 如果反转后整数溢出那么就返回 0。
 *
 *
 */
public class Solution5 {

    public static void main(String[] args) {
        System.out.println(reverse1(-147483648));
    }

    public static int reverse(int x) {

        try {
            if(x>0){//123
                StringBuilder num = new StringBuilder(x+"");
                num.reverse();
                //去掉前导零
                return Integer.parseInt(num.toString());

            }else if(x<0){
                x=x*-1;
                StringBuilder num = new StringBuilder(x+"");
                num.reverse();
                //去掉前导零
                return Integer.parseInt(num.toString())*-1;
            }else{
                return x;
            }
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    //int最大值是2147483647，最小值是-2147483648
    public static int reverse1(int x) {//123

        int rev = 0;
        while (x!=0){
            int m = x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10) return 0;
            rev = rev*10+m;//最大最小数的最后一位余数是1或者2

        }
        return rev;
    }
}
