package Datastructure.problems;

 class ListNode {
      int val;
      ListNode next;
    ListNode(int x) { val = x; }
 }

public class lListPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 != null && ptr2.next != null){
            ptr2 = ptr2.next.next;
            ptr1 = ptr1.next;
        }
        ptr1 = reversed(ptr1);
        ptr2 = head;
        while(ptr1 != null){
            if(ptr1.val != ptr2.val){
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }
    public ListNode reversed (ListNode head){

        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;;
            head = next;
        }
        return prev;
    }
}

