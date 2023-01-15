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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        int size=1;
        ListNode curr=head;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        k=k%size+1;
        ListNode end=curr;
        curr=head;
        int count=0;
        while(count<size-k){
            curr=curr.next;
            count++;
        }
        end.next=head;
        head=curr.next;
        curr.next=null;
        return head;
    }
}