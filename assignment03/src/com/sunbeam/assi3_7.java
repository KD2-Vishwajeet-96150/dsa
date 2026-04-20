package com.sunbeam;

public class assi3_7 {
    public boolean hasCycle(ListNode head) {

        // Edge case
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if (slow == fast) {         // cycle detected
                return true;
            }
        }

        return false; // no cycle
    }
}