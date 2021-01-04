/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null && l2==null)
            return null;
        
        ListNode head= new ListNode();
        ListNode curr=head;
        ListNode prev=head;
        
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) { 
                curr.val=l1.val;
                l1=l1.next;
            } else {
                curr.val=l2.val;
                l2=l2.next;
            }
            prev=curr;
            curr= new ListNode();
            prev.next=curr;
        }
        ListNode remList=l1;
        if(l1==null)
            remList=l2;
        
        while(remList!=null) {
            curr.val=remList.val;
            remList=remList.next;
            prev=curr;
            curr= new ListNode();
            prev.next=curr;
        }
        prev.next=null;
        return head;
    }
}