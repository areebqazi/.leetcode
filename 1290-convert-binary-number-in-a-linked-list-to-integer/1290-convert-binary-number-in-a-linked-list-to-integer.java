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
    public int getDecimalValue(ListNode head) {
        if(head==null)
            return 0;
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        return convert(s);
    }
    public int convert(String s){
        int no=0;
        int pow=0;
        for(int i=s.length()-1;i>=0;i--){
            no+=(s.charAt(i)-'0')*Math.pow(2,pow);
            pow++;
        }
        return no;
    }
}