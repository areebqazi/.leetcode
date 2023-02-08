ListNode dummyHead=new ListNode(-1);
ListNode prev=dummyHead;
prev.next=head;
​
if(head==null||head.next==null) {
return head;
}
​
ListNode first=head;
ListNode second=head.next;
​
while(second!=null) {
ListNode nxt=second.next;
​
prev.next=second;
first.next=nxt;
second.next=first;
if(nxt==null) {
break;
}
​
prev=first;
first=nxt;
second=nxt.next;
}
return dummyHead.next;