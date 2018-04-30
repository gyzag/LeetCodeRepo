/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-04-30 22:48
 **/
public class RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode newHead = new ListNode(0);
    newHead.next = head;
    ListNode slow = newHead;
    ListNode fast = newHead;
    n = n + 1;
    while (n-- > 0) {
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return newHead.next;
  }
}
