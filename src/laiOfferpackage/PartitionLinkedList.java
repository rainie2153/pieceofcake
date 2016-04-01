package laiOfferpackage;

/**
 * Created by yuliu on 3/15/16.
 */
public class PartitionLinkedList {
    static class ListNode {
        int value;
        ListNode next;
        ListNode (int value) {
            this.value = value;
            next = null;
        }
    }

    public ListNode partition(ListNode head, int target) {// one理解为one这个node开头的一个链表就是链表1的头
        if (head == null) return null;
        ListNode dummyhead1 = new ListNode(0);//比target小的放左边
        ListNode dummyhead2 = new ListNode(0);//比target大的放右边
        ListNode tail1 = dummyhead1;
        ListNode tail2 = dummyhead2;
        ListNode curr = head;

        while (curr != null) {
            if (curr.value < target) {
                tail1.next = curr;
                tail1 = curr;
            } else {
                tail2.next = curr;
                tail2 = curr;
            }
            curr = curr.next;
        }
        tail2.next =null;
        tail1.next = dummyhead2.next;
        return dummyhead1.next;
    }




    public static void main(String[] args) {
        PartitionLinkedList rst = new PartitionLinkedList();
        ListNode one = new ListNode(2);
        one.next = new ListNode(4);
        one.next.next = new ListNode(3);
        one.next.next.next = new ListNode(5);


        ListNode result = rst.partition(one, 3);
        print(result);
    }

    static void print(ListNode n) {
        while (n!=null) {
            System.out.print(n.value);
            n = n.next;
        }
    }
}
