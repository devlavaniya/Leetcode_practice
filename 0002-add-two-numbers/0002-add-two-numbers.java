
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry=0;

        while(l1!=null || l2 !=null|| carry!=0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int num = (val1 + val2 +carry);
            carry = num/10;
            int sum = num%10;
            head.next=new ListNode(sum);
            head=head.next;
            if(l1!=null)l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return l3.next;
    }
}