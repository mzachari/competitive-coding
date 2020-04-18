/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

 Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list. Note 2:
Usually the version often seen in the interviews is reversing the whole linked list which is obviously an easier version of this question. 
https://www.interviewbit.com/problems/reverse-link-list-ii/
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
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(B==C || A==null) return A;
        ListNode ptr = A, beforeStart = null, start = null, end = null, afterEnd = null, temp=null;
        int i = 0;
        while(ptr!=null){
            i++;
            if(i== (B-1)){
                beforeStart = ptr;
            }
            else if( i == B){
                start = ptr;
            }
            else if( i == C){
                end = ptr;
            }
            else if( i == (C+1)){
                afterEnd = ptr;
            }
            ptr = ptr.next;
        }
        ListNode afterEndPtr = afterEnd;
        int totalSwaps = (C-B)+1;
        i = 0;
        while(i < totalSwaps){
            temp = start.next;
            start.next = afterEndPtr;
            afterEndPtr = start;
            start = temp;
            i++;
        }
        if(beforeStart!=null)
        beforeStart.next = end;
        if(B==1){
            return end;
        }
        return A;
    }
}
