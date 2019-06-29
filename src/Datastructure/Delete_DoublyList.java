package Datastructure;
//All operations of doubly linkedlist O(1)
public class Delete_DoublyList {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){data = d; }
    }
    public void deleteNode(Node head, Node del){
        if(head == null || del == null){
            return ;
        }
        if(head == del){
            head = del.next;
        }
        if(del.prev != null){
            del.prev.next = del.next;
        }
        return;
    }
    public void push(int x){
        Node newN = new Node(x);
        newN.next = head;
        newN.prev = null;
        if (head != null)
            head.prev = newN;
        head = newN;

    }
    public void PL(Node node){
        Node last = null;
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();

    }
    public static void main(String[] args){
        Delete_DoublyList DLL = new Delete_DoublyList();
        DLL.push(3);
        DLL.push(4);
        DLL.push(5);
        DLL.push(6);
        System.out.println("LIST IS : ");
        DLL.PL(DLL.head);
        DLL.deleteNode(DLL.head, DLL.head);
        System.out.print("\nList after deleting first node: ");
        DLL.PL(DLL.head);
        DLL.deleteNode(DLL.head, DLL.head.next);
        System.out.println("\n LIST after deleting next : ");
        DLL.PL(DLL.head);
    }
}
