package Datastructure;

public class linkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            {data =d; next = null;}
        }
    }
    //insert at head
    public void push(int new_data){
        Node newn = new Node(new_data);
        newn.next = head;
        head = newn;

    }
    public void after(Node prev, int new_data){
        if(prev == null){
            System.out.println("Node is emptuy");
            return;
        }
        Node newN = new Node(new_data);
        newN.next = prev.next;
        prev.next = newN;
    }

    public void end(int new_data){
        Node newN = new Node(new_data);
         /*If the Linked List is empty, then make the
              new node as head */
        if(head == null){
            head = new Node(new_data);
            return;
        }
        newN.next = null;
        /* traverse till the last node */
        Node last = head;
        while (last.next != null){
            last = last.next;
            last.next = newN;
            return;
        }
    }
    /* find length of linkedList */
    public int length(){
        int length = 0;
        Node current = this.head;
        while (current != null){
            length++;
            current = current.next;
        }
        return length;
    }
    public boolean search(Node head, int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;    //data not found
    }
    public void pL(){
        Node n =head;
        while (n!= null){
            System.out.println("LIST ->: " + n.data);
            n=n.next;
        }
    }
    public static void main(String[] args){
        linkedList ll = new linkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.after(ll.head.next, 7);
        ll.end(12);
        ll.pL();
        System.out.println("LENGHT OF LIST: " + ll.length());
        if(ll.search(ll.head, 3))
            System.out.println("YES found value");
        else
            System.out.println("NOT found");
    }
}
