package org.alibaba;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = null;
        while (l1 != null || l2 != null) {
            int s1 = l1 == null ? 0 : l1.val;
            int s2 = l2 == null ? 0 : l2.val;
            int cur = (s1 + s2) % 10;
            int ford = (s1 + s2) / 10;

            if(ret == null) {
                ret = new ListNode(cur);
            }else{
                ret.next = new ListNode(cur);
                ret = ret.next;
            }
            l1 = l1.next == null? null:l1.next;
            l2 = l2.next == null? null:l2.next;
        }
        return ret;
    }
}