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
        int count =  0; 
        ListNode temp = head; 
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        if(count == n) return head.next;
        count = count-n-1 ; 
        System.out.println(count);
        while(count!=0){
            temp = temp.next;
            count--;
        }
        ListNode a = temp.next.next;
        temp.next = a;
        return head;
    }
}