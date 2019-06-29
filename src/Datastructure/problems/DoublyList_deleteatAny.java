package Datastructure.problems;


import java.util.Scanner;

public class DoublyList_deleteatAny {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node (int d){data = d;}
    }
    Node deletatAnyPos(Node head, int pos){
        //checking base case
        if(head == null){
            return null;
        }
        //My position0 to be deleted
        if(pos == 0){
            if(head.next != null){
                head.next.prev = null;
            }
            return head.next;
        }
        Node temp = head;
        while (temp!= null && pos > 1){
            temp = temp.next;
            pos--;
        }
        if (temp == null){
            System.out.println("deltete at anu position");
            return head;
        }
        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
        temp.prev.next = temp.next;
        return head;
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
    public static void main(String args []){
        DoublyList_deleteatAny dl = new DoublyList_deleteatAny();

        dl.push(5);
        dl.push(7);
        dl.push(9);
        dl.push(11);
        System.out.println("created list is : ");
        dl.PL(dl.head);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please eneter you node pos to be deleted: ");
        String input = sc.nextLine();
        System.out.println("input is : " + input);
        dl.deletatAnyPos(dl.head, 2);
        System.out.println("After deletion is : ");
        dl.PL(dl.head);
    }

}
