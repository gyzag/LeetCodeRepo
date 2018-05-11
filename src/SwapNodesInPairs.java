/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-11 21:47
 **/
public class SwapNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    ListNode newHead = new ListNode(0);
    newHead.next = head;
    head = newHead;
    ListNode cur, next;
    if (head.next == null) {
      return newHead.next;
    }
    cur = head.next;
    if (cur.next == null) {
      return newHead.next;
    }
    next = cur.next;
    swap(head, cur, next);
    return newHead.next;
  }

  public void swap(ListNode head, ListNode cur, ListNode next) {
    head.next = next;
    cur.next = next.next;
    next.next = cur;
    ListNode c = cur;
    cur = next;
    next = c;
    head = head.next.next;
    if (cur.next.next == null || next.next.next == null) {
      return;
    }
    cur = cur.next.next;
    next = next.next.next;
    swap(head, cur, next);
  }

}
