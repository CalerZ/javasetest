package com.caler.leetcode;

import java.util.Arrays;

/**
 * @author Caler_赵康乐
 * @create 2020-02-28 15:02
 * @description :URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-url-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution3 {

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
        Solution3 s = new Solution3();
        System.out.println(s.CheckPermutation("abc", "bad"));
    }
}
