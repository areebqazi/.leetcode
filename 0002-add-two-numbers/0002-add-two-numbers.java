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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode c = head;
        while(a!=null || b!=null){
            int sum=0;
            if(a!=null){
                sum = sum+a.val;
                a=a.next;
            }
            if(b!=null){
                sum = sum+b.val;
                b=b.next;
            }
            sum =sum+ carry;
            carry = 0;
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            ListNode d = new ListNode (sum);
            c.next = d;
            c = c.next;
        }
            if(carry>0){
                ListNode temp = new ListNode(carry);
                c.next = temp;
            }
        return head.next;
        }
}