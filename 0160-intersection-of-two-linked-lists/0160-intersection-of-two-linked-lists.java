/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private static int LLsize(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            ++count;
            curr=curr.next;
        }return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA,tempB=headB;
        int m=LLsize(headA);
        int n=LLsize(headB);
        if(m>n){
            int diff=m-n;
            for(int iterate=0;iterate<diff;++iterate){
                headA=headA.next;
            }
        }else if(m<n){
            int diff=n-m;
            for(int iterate=0;iterate<diff;++iterate){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA.val==headB.val){
                if(headA==headB){return headA;}
            }
            headA=headA.next;headB=headB.next;
        }
        return null;
    }
}