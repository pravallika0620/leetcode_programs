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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       if(head==null || head.next==null){
        return head;
       }else{
        ListNode temp=head.next;
        ListNode curr=head;
        while(temp!=null){
        int val=gcd(curr.val,temp.val);
        ListNode newnode=new ListNode(val);
        curr.next=newnode;
        newnode.next=temp;
        curr=temp;
        temp=temp.next; 
        }
       }
        return head; 
       }
       private int gcd(int a,int b){
    if(b==0)return a;
    return gcd(b,a%b);
}
}
