/*
Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists, and should also be sorted.

For example, given following linked lists :

  5 -> 8 -> 20 
  4 -> 11 -> 15
The merged list should be :

4 -> 5 -> 8 -> 11 -> 15 -> 20

https://www.interviewbit.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(B== null) return A;
        if(A== null) return B;
        ListNode sortedHead = new ListNode(0);
        ListNode ptrA = A, ptrB = B, ptrSorted = sortedHead;
        int valA,valB;
        while(ptrA != null || ptrB != null){
            valA = ptrA == null? Integer.MAX_VALUE: ptrA.val;
            valB = ptrB == null? Integer.MAX_VALUE: ptrB.val;
            if(valA < valB){
                ptrSorted.val = ptrA.val;
                ptrA = ptrA.next;
            }
            else{
                ptrSorted.val = ptrB.val;
                ptrB = ptrB.next;
            }
            if(ptrA == null && ptrB == null) break;
            ptrSorted.next = new ListNode(0);
            ptrSorted = ptrSorted.next;
        }
        return sortedHead;
    }
}
