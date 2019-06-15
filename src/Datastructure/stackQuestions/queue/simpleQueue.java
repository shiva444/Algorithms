package Datastructure.stackQuestions.queue;

public class simpleQueue {
    private static int front, rear, size;
    private static int queue[];
    simpleQueue(int c){
        front = rear = 0;
        size = c;
        queue = new int[size];
    }
    static void enQueue(int x){
        if(size == rear){
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = x;
            rear++;
        }
        return;
    }
    static void dequeue(){
        if(front == rear){
            System.out.println("isempty");
            return;
        } else {
            for(int i = 0; i < rear -1 ; i++){
                queue[i] = queue[i + 1];
            }
            if(rear < size)
                queue[rear] = 0;
            rear--;
        }
        return;
    }
    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }
    static void queueFront()
    {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }
    public static void main(String [] args){
        simpleQueue q = new simpleQueue(6);
        q.enQueue(5);
        q.enQueue(15);
        q.enQueue(51);
        q.enQueue(53);
        q.enQueue(53);
        q.enQueue(53);
        q.queueDisplay();
        q.dequeue();
        q.dequeue();
        q.queueDisplay();
        q.queueFront();
    }
}
