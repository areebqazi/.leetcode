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
         int sum = 0,carry = 0;
        ListNode head = new ListNode(0);
        ListNode c = head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = reverse(l1);
        ListNode b = reverse(l2);
        while(a!=null && b!=null){
            sum = a.val+b.val+carry;
            carry = 0;
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            ListNode d = new ListNode (sum);
            c.next = d;
            c = c.next;
            a = a.next;
            b = b.next;
        }
            if(a!=null)
                fill(a);
            else if(b!=null)
                fill(b);
            
            if(carry>0){
                ListNode temp = new ListNode(carry);
                c.next = temp;
            }
        
        return reverse(head.next);
    }
    public static ListNode reverse(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode curr=head.next;
        ListNode prev=head;
        while(curr!=null){
             ListNode next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
        }
        head.next=null;
        head=prev;
        return head;
    }
     public void fill(ListNode a){
        while(a!=null){
            sum = a.val+carry;
            carry=0;
            if(sum > 9){
                sum = sum % 10;
                carry = 1;
            }
            ListNode d = new ListNode (sum);
            c.next = d;
            c = c.next;
            a = a.next;
        }
    }
}