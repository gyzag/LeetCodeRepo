/**
 * @author GYZ
 * @DESCRIPTION
 * @create 2018-05-11 21:43
 **/
public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode newNode = new ListNode(100);
    ListNode curL1 = l1;
    ListNode curL2 = l2;
    ListNode curNode = newNode;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curNode.next = l1;
        curNode = curNode.next;
        l1 = l1.next;
      } else {
        curNode.next = l2;
        curNode = curNode.next;
        l2 = l2.next;
      }
    }
    if (l1 == null) {
      curNode.next = l2;
    } else {
      curNode.next = l1;
    }
    return newNode.next;
  }
}
