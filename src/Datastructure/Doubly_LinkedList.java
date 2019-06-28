package Datastructure;

public class Doubly_LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){data = d;}
    }
    void insertatHead(int new_data){
        Node newN = new Node(new_data);
        newN.next = head;
        newN.prev = null;
        if(head != null)
            head.prev = newN;
            head = newN;
    }
    void insertAfter(Node prev, int new_data){
        if(prev == null){
            return;
        }
        Node newN = new Node(new_data);
        newN.next = prev.next;
        prev.next = newN;
        newN.prev = prev;
        if (newN.next != null)
            newN.next.prev = newN;
    }
    void append(int new_data){
        Node newN = new Node(new_data);
        Node last = head;
        newN.next = null;
        if(head == null){
            newN.prev = null;
            head =newN;
            return;
        }
        while (last.next != null)
            last = last.next;
        last.next = newN;
        newN.prev = last;
    }
    public void printlist(Node node) {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public static void main(String[] args) {

        Doubly_LinkedList dll = new Doubly_LinkedList();
        dll.append(6);
        dll.insertatHead(7);
        dll.insertatHead(1);
        dll.append(4);
        dll.insertAfter(dll.head.next, 8);
        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
