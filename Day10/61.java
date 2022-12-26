class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;
        ListNode dummy=head;
        int count=1;
        while(dummy.next!=null){
            dummy=dummy.next;
            count++;
        }
        dummy.next=head;
        k=k%count;
        k=count-k;
        while(k-- >0)
            dummy=dummy.next;
        head=dummy.next;
        dummy.next=null;
        return head;
    }
}
