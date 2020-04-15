package com.carler.leetcode;

import java.util.Stack;

/**
 * @author Caler_赵康乐
 * @create 2020-03-02 15:07
 * @description :
 *
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true

 *
 */
public class Solution8 {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    //可以使用栈方式解决
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            if('('==chars[i]||'{'==chars[i]||'['==chars[i]){
                stack.push(chars[i]);
                continue;
            }
            if((')'==chars[i]||'}'==chars[i]||']'==chars[i])&&!stack.isEmpty()){
                Character c = stack.pop();
                if(!((""+c+chars[i]).equals("()")||(""+c+chars[i]).equals("[]")||(""+c+chars[i]).equals("{}"))){
                    return false;
                }
            }else{
                return false;
            }

        }

        if(stack.isEmpty()){
            return true;

        }else{
            return false;
        }
    }
}
