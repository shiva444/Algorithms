package Datastructure;

public class nodemiddleDelete {
    static class Node{
        int data;
        Node next;
    }
    static Node delete(Node head) {
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        Node first = head;
        Node sec = head;
        Node prev = null;
        while (sec != null && sec.next != null){
            sec = sec.next.next;
            prev = first;
            first = first.next;
        }
        prev.next = first.next;
        return head;
    }
    static void printList(Node ptr) {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
    public static void main(String[] args){
        Node head = newNode(1);
        head.next = newNode(3);
        head.next.next = newNode(5);
        head.next.next.next = newNode(7);
        head.next.next.next.next = newNode(9);
        System.out.println("List is : ");
        printList(head);
        head  = delete(head);
        System.out.println("\nDeletion after list is :");
        printList(head);

    }
}
