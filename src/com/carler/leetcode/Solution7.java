package com.carler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-02 14:38
 * @description :
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Solution7 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length<1) return "";
        String prix=strs[0];
        for (int i=0;i<strs.length;i++){
           //strs[i]和 strs[i+1]比较相同的前缀，拿到这个前缀跟下一元素比较
            while (strs[i].indexOf(prix)!=0){
                prix = prix.substring(0,prix.length()-1);
                if(prix.isEmpty()) return "";
            }
        }
        return prix;

    }

}
