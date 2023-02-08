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
        if(head==null)
            return null;
        
        int size=0;
        ListNode temp=head;
        
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        size=size-n;
        
        if(size==0)
            return head.next;
        
        temp=head;
        
        while(size!=1){
            temp=temp.next;
            size--;
        }
        
        temp.next=temp.next.next;
        return head;
    }
}