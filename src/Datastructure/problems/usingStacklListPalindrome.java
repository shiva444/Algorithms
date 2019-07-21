package Datastructure.problems;

import java.util.Stack;

public class usingStacklListPalindrome {
   public static boolean isPalindrome(Node head){
       Node fast = head;
       Node slow = head;
       Stack<Integer> stk = new Stack<>();
       while (fast != null && fast.next != null){
           stk.push(slow.data);
           slow = slow.next;
           fast = fast.next.next;
       }
       if(fast != null){
           slow = slow.next;
       }
       while (slow != null){
           int top = stk.pop().intValue();
           if (top != slow.data){
               return false;
           } 
           slow = slow.next;
       }
       return true;
   }
   public static void main(String[] args){
       Node one = new Node(1);
       Node two = new Node(2);
       Node three = new Node(3);
       Node four = new Node(4);
       Node five = new Node(3);
       Node six = new Node(2);
       Node seven = new Node(1);
       one.next = two;
       two.next = three;
       three.next = four;
       four.next = five;
       five.next = six;
       six.next = seven;

       boolean cond = isPalindrome(one);
       System.out.println(cond);

   }
}
