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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size+=1;
            curr=curr.next;
        }
        if(n==size){
            return head.next;
        }
        int delete=size-n;
        ListNode curr1=head;
        int count=0;
        while(curr1.next!=null){
            count++;
            if(count==delete){
                curr1.next=curr1.next.next;
                break;
            }
            curr1=curr1.next;
        }
        return head;
    }
}
