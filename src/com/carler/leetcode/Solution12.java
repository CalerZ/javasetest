package com.carler.leetcode;

import java.util.*;

/**
 * @author Caler_赵康乐
 * @create 2020-03-15 19:05
 * @description :
 *
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 *
 */
public class Solution12 {
    public static void main(String[] args) {
        lengthOfLongestSubstring3("pwwkew");
    }

    public static int lengthOfLongestSubstring(String s) {
        int max =0;
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j <= s.length() ; j++) {
                String s1 = s.substring(i, j);
                if(quchong(s1))
                    max =Math.max(max,s1.length());
            }
        }
        return max;
    }

    public static boolean quchong(String s){
        Set<Character> set = new LinkedHashSet();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    /**
     * 利用set和list长度进行判断截取没有重复且最长的子字符串
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s) {
        List<Character> list = new LinkedList<Character>();
        int maxLength = 0;
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); ) {
            char c = s.charAt(i);
            if (list.size() == set.size()) {
                list.add(c);
                set.add(c);
                i++;
            } else {
                i -= set.size();
                list.clear();
                set.clear();
            }
            System.out.println(list);
            System.out.println(set);
            if (set.size() > maxLength) {
                maxLength = set.size();
            }
        }
        return maxLength;
    }


    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }



}
