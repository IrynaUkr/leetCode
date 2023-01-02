package easy.tasks;

import easy.models.ListNode;

public class Test {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode();
        ListNode pointer = head;
        node.next = pointer;
        while (pointer != null && pointer.next != null) {

            if (pointer.val == pointer.next.val) {
                ListNode prev = pointer;
                while ( prev.next!=null && prev.val == prev.next.val ) {
                    if (prev.next.next != null) {
                        prev.next = prev.next.next;
                    }else{
                        prev.next = null;
                    }
                }
                prev = prev.next;
                pointer.next = prev;
            }
            pointer = pointer.next;
        }
        return node.next;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode fourth = new ListNode();
        ListNode fifth = new ListNode();
        first.val = 2;
        second.val = 2;
        third.val = 2;
        fourth.val = 2;
        fifth.val = 2;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode listNode = deleteDuplicates(first);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

}
