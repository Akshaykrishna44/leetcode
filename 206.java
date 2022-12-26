class Solution {
    public ListNode reverseList(ListNode head) {
    return reverse(head, null);
}

private ListNode reverse(ListNode head, ListNode reversed) {
    if ( head == null) return reversed;
    ListNode temp = head;
    head = head.next;
    
    temp.next = reversed;
    reversed = temp;
    return reverse(head, reversed);
}
}
