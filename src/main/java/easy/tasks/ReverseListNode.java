package easy.tasks;

import easy.models.ListNode;

public class ReverseListNode {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode reversedHead = head;

        //creating last node and link its end  to the null
        ListNode tempTail =reversedHead.next;
        reversedHead.next = null;

        while(tempTail != null){
            ListNode tempHead = tempTail.next;
            tempTail.next = reversedHead;
            tempTail = tempHead;
            reversedHead=tempTail;
        }
        return reversedHead;

    }
}
