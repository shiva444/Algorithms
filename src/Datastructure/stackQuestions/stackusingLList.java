package Datastructure.stackQuestions;

import static java.lang.System.exit;

public class stackusingLList {

    private class Node{
        int data;
        Node head;
    }
    Node top;
    // Constructor
    private stackusingLList(){
        this.top = null;
    }
// push function
    public void push(int x){
        Node newN = new Node();
        if(newN == null){
            System.out.println("Overflow");
            return;
        }
        // initalizing data to my argument, and put the reference into top
        newN.data = x;
        newN.head = top;
        top = newN;
    }

    public boolean isEmpty(){
        return top == null;
    }
    int peek(){
        if(!isEmpty()){
            System.out.println("PEEK VALUE IS : " + top.data);
            return top.data;
        } else
        {
            System.out.println("EMPTY");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("underflow");
            return;
        }
        top = (top).head;
    }

    public void display(){
        if(top == null){
            System.out.println("over");
            exit(1);
        } else {
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.head;
            }
        }
    }

    public static void main(String args []){
        stackusingLList s = new stackusingLList();
        s.push(2);
        s.push(21);
        s.push(23);
        s.push(24);
        s.pop();
        s.peek();
        s.display();

    }
}
