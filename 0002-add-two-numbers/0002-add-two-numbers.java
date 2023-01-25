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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
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
        return head.next;
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