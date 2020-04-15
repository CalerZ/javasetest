package com.carler.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/**
 * @author Caler_赵康乐
 * @create 2020-02-28 15:02
 * @description :给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */
public class Solution2 {

    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return new String(chars1).equals(new String(chars2));
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.CheckPermutation("abc", "bad"));
    }
}
