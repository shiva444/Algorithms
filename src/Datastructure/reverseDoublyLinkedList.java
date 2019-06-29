package Datastructure;
//time complexity O(n)

public class reverseDoublyLinkedList {
    static Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){data = d;}
    }
    void reverse(){
        Node temp = null;
        Node curr = head;
        while (curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
    public void push(int x){
        Node newN = new Node(x);
        newN.next = head;
        newN.prev = null;
        if (head != null) {
            head.prev = newN;
        }
        head = newN;

    }

    public void PL(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

        System.out.println();
    }
    public static void main(String[] args){
        reverseDoublyLinkedList rl = new reverseDoublyLinkedList();
        rl.push(5);
        rl.push(10);
        rl.push(15);
        rl.push(25);
        System.out.println("list is : ");
        rl.PL(head);
        rl.reverse();
        System.out.println("reverse list is : ");
        rl.PL(head);
    }
}
