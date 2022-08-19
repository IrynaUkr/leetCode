package easy.tasks;

import easy.models.ListNode;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
       //create pointer to save nodes without changes
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        while (pointer1 != null && pointer2 != null) {

            if (pointer1.val < pointer2.val) {
                tail.next = new ListNode(pointer1.val);
                tail = tail.next;
                pointer1 = pointer1.next;
            } else {
                tail.next = new ListNode(pointer2.val);
                tail = tail.next;
                pointer2 = pointer2.next;
            }
        }

        //append  tail
        if (pointer1 != null) {
            tail.next = pointer1;
        } else if (pointer2 != null) {
            tail.next = pointer2;
        }
        return head.next;
    }
}
