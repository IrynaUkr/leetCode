package medium.tasks;

import easy.models.ListNode;

import static java.lang.Math.abs;

public class TwoSumLinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode emptyHead = new ListNode();
        ListNode temp = emptyHead;
        int dosens = 0;
        while (l1!= null || l2 != null || dosens == 1) {
            int currentSum = 0;
            if (l1 != null) {
                currentSum = currentSum + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                currentSum = currentSum + l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(currentSum % 10 + dosens);
            dosens = currentSum / 10;
            temp.next = node;
            temp = temp.next;

        }
        return emptyHead.next;
    }
}


