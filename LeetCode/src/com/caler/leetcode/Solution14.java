package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-26 23:04
 * @description :
 *
 *
 * 477. 汉明距离总和
 * 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 *
 * 计算一个数组中，任意两个数之间汉明距离的总和。
 *
 * 示例:
 *
 * 输入: 4, 14, 2
 *
 * 输出: 6
 *
 * 解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
 * 所以答案为：
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * 注意:
 *
 * 数组中元素的范围为从 0到 10^9。
 * 数组的长度不超过 10^4。
 */
public class Solution14 {
    public static void main(String[] args) {
        System.out.println(totalHammingDistance(new int[]{4, 14, 2}));
    }


    public static int totalHammingDistance(int[] nums) {
        int total =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                total += hammingDistance(nums[i],nums[j]);
            }
        }
        return total;

    }

    public static int hammingDistance(int x,int y){
        int i=x^y;
        int dis=0;
        while(i!=0){
            dis++;
            i=i&(i-1);
        }
        return dis;
    }
}
