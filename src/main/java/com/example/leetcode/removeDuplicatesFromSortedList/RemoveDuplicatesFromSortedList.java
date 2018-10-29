package com.example.leetcode.removeDuplicatesFromSortedList;

import com.example.leetcode.mergeTwoSortedLists.MergeTwoSortedLists;

/**
 * Created by wyb on 2018/10/29.
 */
public class RemoveDuplicatesFromSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);
        System.out.println(result);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
