package LinkedList;

/**
 * @author: zhangyongbin
 * @Time: 9/26/2017.
 * @Description:
 * 要理解链表当中的头指针是什么意思，不要盲目的瞎用，只得其形而不得其要害！基础还是不够牢固！
 */
public class ListNodeTest {
    private static ListNode head;
    private static ListNode a;
    private static ListNode b;
    private static ListNode c;
    private static ListNode d;
    private static ListNode e;

    public static void main(String[] args) {
        head = new ListNode(000);
        a = new ListNode(3);
         a.val = 3;
         b = new ListNode(45);
         b.val = 45;
         c = new ListNode(67);
         c.val = 67;
         d = new ListNode(78);
         d.val = 78;
         e = new ListNode(89);
         e.val = 100;

        head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        printList(a);
    }

    private static void printList(ListNode head){
//        System.out.print("head");
        _while (head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print("-->");
            }
            head = head.next;
        }
    }
}
