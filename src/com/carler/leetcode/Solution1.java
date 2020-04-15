package com.carler.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Caler_赵康乐
 * @create 2020-02-28 14:56
 * @description :实现一个算法，确定一个字符串 s 的所有字符是否全都不同
 */
public class Solution1 {

    public boolean isUnique(String astr) {
        char[] chars = astr.toCharArray();
        Set set = new HashSet();
        for (int i=0;i<chars.length;i++){
            set.add(chars[1]);
        }
        return chars.length==set.size();
    }
}
