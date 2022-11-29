package org.example.Problem143;

import org.example.IResolvable;
import org.example.Problem;

public class Problem143 extends Problem implements IResolvable {

    public Problem143() {
        System.out.println("143. Reorder List");
        System.out.println("https://leetcode.com/problems/reorder-list/");
        lineBreak();
    }

    @Override
    public void resolve() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        validate(new int[]{1, 4, 2, 3}, reorderList(listNode));
        validate(new int[]{1, 5, 2, 4, 3}, reorderList(new int[]{1, 2, 3, 4, 5}));
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode n = reverse(slow.next);
        slow.next = null;

        ListNode m = head;

        while (m != null && n != null) {
            ListNode tempM = m.next;
            ListNode tempN = n.next;

            m.next = n;
            n.next = tempM;
            m = tempM;
            n = tempN;
        }
    }

    public ListNode reverse(ListNode start) {
        if (start == null || start.next == null) return start;

        ListNode m = start;
        ListNode n = start.next;
        start.next = null;
        while (m != null && n!= null) {
            ListNode temp = n.next;
            n.next = m;
            m =n;
            n = temp;
        }

        return m;
    }

}
