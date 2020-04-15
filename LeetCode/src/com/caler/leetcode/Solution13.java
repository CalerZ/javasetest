package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-26 22:30
 * @description :
 * <p>
 * 461. 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class Solution13 {

    public static void main(String[] args) {
        System.out.println(hammingDistance3(10, 4));
    }


    public static int hammingDistance1(int x, int y) {
        int i = x ^ y;
        return Integer.bitCount(i);
    }

    public static int hammingDistance2(int x, int y) {
        int i = x ^ y;
        int distance = 0;
        while (i != 0) {
            if (i % 2 == 1) {
                distance++;
            }
            i = i >> 1;
        }
        return distance;

    }


    public static int hammingDistance3(int x, int y) {
        int i = x ^ y;
        int distance = 0;
        while (i != 0) {
            distance++;
            i = i & (i - 1);
        }
        return distance;

    }
}
