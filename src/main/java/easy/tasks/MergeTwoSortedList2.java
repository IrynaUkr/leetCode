package easy.tasks;

import easy.models.ListNode;

public class MergeTwoSortedList2 {
    public  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 == null) {
            return list1;
        }
        if (list2 != null && list1 == null) {
            return list2;
        }
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode currentNode;


        if (list1.val < list2.val) {
            currentNode = new ListNode(list1.val);
            pointer1 = pointer1.next;
        } else {
            currentNode = new ListNode(list2.val);
            pointer2 = pointer2.next;
        }
        ListNode head = currentNode;
        while (pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                currentNode.next = new ListNode(pointer2.val);
                pointer2 =  pointer2.next;
                currentNode = currentNode.next;
                continue;

            }if (pointer2 == null) {
                currentNode.next = new ListNode(pointer1.val);
                pointer1 =  pointer1.next;
                currentNode = currentNode.next;
                continue;
            }

            if (pointer1.val < pointer2.val) {
                currentNode = new ListNode(list1.val);
                pointer1 = pointer1.next;
            } else {
                currentNode = new ListNode(list2.val);
                pointer2 = pointer2.next;
            }
            currentNode = currentNode.next;
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
