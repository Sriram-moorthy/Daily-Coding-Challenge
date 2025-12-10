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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode curr=head;
        ListNode sorted=dummy;
        while(curr!=null && curr.next!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                    
                }
                sorted.next=curr.next;
            }else{
               sorted= sorted.next;
            }
            curr=curr.next;
        }
        return dummy.next;
    }
}Remove Duplicates from Sorted List II.java
