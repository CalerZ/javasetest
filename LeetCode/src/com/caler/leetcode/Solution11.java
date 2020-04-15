package com.caler.leetcode;

/**
 * @author Caler_赵康乐
 * @create 2020-03-12 19:12
 * @description :
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
 * 并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution11 {

    public static void main(String[] args) {
        ListNode ll1 = new ListNode(2);
        ListNode ll2 = new ListNode(4);
        ListNode ll3 = new ListNode(3);
        ll1.next=ll2;
        ll2.next=ll3;
        ListNode l21 = new ListNode(2);
        ListNode l22 = new ListNode(4);
        ListNode l23 = new ListNode(3);
        l21.next=l22;
        l22.next=l23;

        addTwoNumbers(ll1,l21);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ll1 = new ListNode(l1.val+l2.val);
        while (l1!=null&&l2!=null){

            l1=l1.next;
            l2=l2.next;
            ll1.next= new ListNode(l1.val+l2.val);
            System.out.println(l1.val+l2.val);

        }



        return null;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
