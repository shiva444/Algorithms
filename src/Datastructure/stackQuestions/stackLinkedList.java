package Datastructure.stackQuestions;

import java.util.Stack;

public class stackLinkedList {
    static class Node{
        int data;
        Node next;
    }
    static Node head = null;
    static void push(int new_data){
        Node newN = new Node();
        newN.data = new_data;
        newN.next = (head);
        (head) = newN;
    }
    static Node reverse(Node head){
        Stack<Node> n = new Stack<>();
        Node temp = head;
        while (temp.next != null){
            n.push(temp);
            temp = temp.next;
        }
        head = temp;
        while (!n.isEmpty()){
            temp.next = n.peek();
            temp = temp.next;
            n.pop();
        }
        temp.next = null;
        return head;
    }
    static void printList(Node head){
        while (head != null){
            System.out.println("NEW : " + head.data);
            head = head.next;
        }
    }
    public static void main(String[] args){
        push( 1);
        push( 2);
        push( 3);
        push( 4);
        push( 5);
        head = reverse(head);
        printList(head);
    }
}
