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
        ListNode initList = null;
        ListNode ret = null;
        int ford = 0;
        while (l1 != null || l2 != null || ford != 0) {
            int s1 = l1 == null ? 0 : l1.val;
            int s2 = l2 == null ? 0 : l2.val;
            int cur = (s1 + s2 + ford) % 10;
            ford = (s1 + s2 + ford) / 10;

            if (initList == null) {
                initList = new ListNode(cur);
                ret = initList;
            } else {
                initList.next = new ListNode(cur);
                initList = initList.next;
            }
            if (l1 != null)
                l1 = l1.next == null ? null : l1.next;
            if (l2 != null)
                l2 = l2.next == null ? null : l2.next;
        }
        return ret;
    }
}