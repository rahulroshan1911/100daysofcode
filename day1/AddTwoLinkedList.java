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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=new ListNode();
        ListNode curr= head;
        ListNode prev=null;
        while(l1!=null && l2!=null) {
            int s=l1.val+l2.val+carry;
            if(s<10) {
                curr.val=s;
                    carry=0;
            } else {
                curr.val=s%10;
                carry=s/10;
            }
                ListNode next = new ListNode();
                curr.next= next;
                prev=curr;
                curr= next;
            l1=l1.next;
            l2=l2.next;
        }
        ListNode rem=null;
        if(l1==null)
            rem=l2;
        else if(l2==null)
            rem=l1;
        
        while(rem!=null) {
            int s=carry+rem.val;
            if(s<10) {
                curr.val=s;
                    carry=0;
            } else {
                curr.val=s%10;
                carry=s/10;
            }
                ListNode next = new ListNode();
                curr.next= next;
                prev=curr;
                curr= next;
            rem=rem.next;
        }
        if(carry>0) {
            curr.val=carry;
            curr.next=null;
        } else
            prev.next=null;
        return head;
    }
}