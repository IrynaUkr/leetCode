package easy.tasks;

import easy.models.ListNode;

public class MiddleListNode {
    public static ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode copy = head;
        while (copy != null) {
            copy = copy.next;
            counter++;
        }
        ListNode result = head;
        int numberOfMiddleNode = counter / 2;

        int number = 0;
        while (number < numberOfMiddleNode) {
            result = result.next;
            number++;
        }

        return result;
    }

    public static ListNode middleNodeOneIteration(ListNode head) {
        ListNode middle = head;
        ListNode fast = head;
        int counter = 0;
        while (fast.next != null) {
            fast = fast.next;
            counter++;
            if (counter % 2 == 0) {
                middle = middle.next;
            }
        }
        if (counter % 2 == 1) {
            middle = middle.next;
        }
        return middle;
    }

    public static void main(String[] args) {
        ListNode white1 = new ListNode(1);
        ListNode white2 = new ListNode(2);
        ListNode white3 = new ListNode(3);
        ListNode white4 = new ListNode(4);
        ListNode white5 = new ListNode(5);
        ListNode white6 = new ListNode(6);
        white1.next = white2;
        white2.next = white3;
        white3.next = white4;
        white4.next = white5;
        white5.next = white6;
        ListNode listNode = middleNode(white1);
        System.out.println("answer " + listNode.val);
        ListNode listNode2 = middleNodeOneIteration(white1);
        System.out.println("answer2 " + listNode.val);
    }

}
