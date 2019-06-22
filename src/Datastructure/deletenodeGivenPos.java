package Datastructure;

import java.util.Scanner;

public class deletenodeGivenPos {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void push(int new_data) {
        Node n = new Node(new_data);
        n.next = head;
        head = n;
    }

    String delete(int pos) {
        // base condition check
        if (head == null)
            return null;
        Node temp = head;
        if (pos == 0) {
            head = temp.next;
            return null;
        }
        for (int i = 0; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return null;
        Node next = temp.next.next;
        temp.next = next;
        return null;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String [] args){
        deletenodeGivenPos llist = new deletenodeGivenPos();
        System.out.println("Node position you want to delete: ");

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        System.out.println("LIST IS ->");
        llist.printList();
        llist.delete(3);
        System.out.println("\n deletion list is: ");
        llist.printList();
    }


}
