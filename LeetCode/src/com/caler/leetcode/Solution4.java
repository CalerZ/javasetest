package com.caler.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Caler_赵康乐
 * @create 2020-02-28 15:02
 * @description : *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，
 * 并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class Solution4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {



        Set<Integer> set = new HashSet();
        for (int i=0;i<nums.length;i++){

            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    set.add(i);
                    set.add(j);
                }
            }
        }
        int z=0;
        StringBuilder sb = new StringBuilder();
        int[] pos = new int[set.size()];

        for (Integer i: set) {

            pos[z++]=i;
        }

        return pos;
    }

}
