package easy.tasks;

import easy.models.ListNode;

public class MergeTwoSortedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
    public static void main(String[] args) {
        ListNode white1 = new ListNode(1);
        ListNode white2 = new ListNode(2);
        ListNode white3 = new ListNode(5);
        white1.next = white2;
        white2.next = white3;
        ListNode red1 = new ListNode(6);
        ListNode red2 = new ListNode(10);
        ListNode red3 = new ListNode(11);
        red1.next = red2;
        red2.next = red3;


        ListNode merged = mergeTwoLists(white1, red1);
        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }
    }
}
