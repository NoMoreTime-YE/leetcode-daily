package org.alibaba;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node{
    public Integer value;
    public Node next;
    public Node(Integer cur){
        value = cur;
    }
    public boolean bigger(Integer in){
        return value.intValue() >= (in.intValue());
    }

}

class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Node move = null;
        Node head = null;
        for (int i = 0; i < nums1.length; i++) {
            move = new Node(nums1[i]);
            if (i == 0) {
                head = move;
            }
            move = move.next;
        }

        Node tmpHead = head;
        for (int i = 0; i < nums2.length; i++) {

            if (i == 0) {
                if (tmpHead.bigger(nums2[i])) {
                    Node n = new Node(nums2[i]);
                    n.next = tmpHead;
                    tmpHead = n;
                }
            } else {

            }
        }
        return 0;
    }
}
