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
    public void reorderList(ListNode head) {
        if(head == null) return ; 
        ListNode temp = head;
        int count = 0; 
        Stack<ListNode> s = new Stack<>();
        while(temp!=null){
            s.push(temp);
            temp = temp.next;
            count++;
        }
        ListNode curr = head;
        int i = 0; 
        while(i<count/2){
            ListNode newNode = s.pop();
            temp = curr.next;
            curr.next = newNode;
            newNode.next = temp;
            curr = temp;
            i++;
        }
        curr.next = null;
    }
}