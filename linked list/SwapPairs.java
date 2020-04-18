/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode ptr1 = A;
        if(ptr1 == null) return A;
        ListNode ptr2 = A.next;
        ListNode newHead = A.next;
        ListNode prevNode = A;
        if(ptr2 == null) return A;
        
        while(ptr1 != null && ptr2 != null){
            // System.out.println("ptr1 " + ptr1.val);
            // System.out.println("ptr2 " + ptr2.val);
            prevNode.next = ptr2;
            ptr1.next = ptr2.next;
            ptr2.next = ptr1;
            
            
            prevNode = ptr1;
            ptr1 = ptr1.next;
            if(ptr1 != null)ptr2 = ptr1.next;
        }
        
        return newHead;
       
    }
}
