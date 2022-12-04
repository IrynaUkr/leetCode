package easy.tasks;
//https://leetcode.com/problems/linked-list-cycle-ii/solutions/44774/java-o-1-space-solution-with-detailed-explanation/?envType=study-plan&id=level-1
import easy.models.ListNode;

public class CycleLinkedList {
    public static ListNode cycle(ListNode head){
            ListNode slow = head;
            ListNode fast = head;

            while (fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;

                if (fast == slow){
                    ListNode slow2 = head;
                    while (slow2 != slow){
                        slow = slow.next;
                        slow2 = slow2.next;
                    }
                    return slow;
                }
            }
            return null;
        }

    public static void main(String[] args) {
        ListNode white1 = new ListNode(1);
        ListNode white2 = new ListNode(2);
        ListNode white3 = new ListNode(3);
        ListNode white4 = new ListNode(4);
        ListNode white5 = new ListNode(5);

        white1.next = white2;
        white2.next = white3;
        white3.next = white4;
        white4.next = white5;
        white5.next =white2;
        ListNode listNode = cycle(white1);
        System.out.println("answer " +listNode.val);

    }
}
