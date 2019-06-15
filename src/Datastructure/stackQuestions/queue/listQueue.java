package Datastructure.stackQuestions.queue;

class Node{
        int key;
        Node next;
        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }
    class listQueue{
    Node front, rear;
    public listQueue(){
       this.front = this.rear = null;
    }
    void enQueue(int key){
        Node temp = new Node(key);
        if(this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    Node deQueue(){
        if(this.front == null)
            return null;
        Node temp = this.front;
        this.front = this.front.next;
        if(this.front == null)
            this.rear = null;
        return temp;
    }
    public static void main(String[] args){
        listQueue n = new listQueue();
        n.enQueue(3);
        n.enQueue(23);
        n.enQueue(43);
        n.deQueue();
        n.enQueue(45);
        System.out.println("DEQUES IS : "+ n.deQueue().key);
    }

}


