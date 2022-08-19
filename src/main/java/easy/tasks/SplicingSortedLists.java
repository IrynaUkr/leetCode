package easy.tasks;

import easy.models.ListNode;

public class SplicingSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //we need create pointer which we use to get head of the list node
        ListNode head = new ListNode();
        //in this node we will accumulate nodes with lesser value
        ListNode tail = head;

        while (list1 != null || list2 != null) {

            if (list2 == null || (list1 != null && list1.val < list2.val)) {
                //this only for the first iteration, to tie the first node to the head
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
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
