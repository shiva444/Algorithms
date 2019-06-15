package Datastructure.stackQuestions.queue;


public class arrayQueue {
    int front, rear, size;
    int capacity;
    int array[];
    public arrayQueue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    boolean isFull(arrayQueue queue)
    {  return (queue.size == queue.capacity);
    }
    boolean isEmpty(arrayQueue Queue){
        return (Queue.size == 0);
    }
    void enqueue(int item){
       if(isFull(this))
           return;
       this.rear = (this.rear + 1)%this.capacity;
       this.array[this.rear] = item;
       this.size = this.size + 1;
        System.out.println(item + "Enqueued");
    }
    int dequeue(){
        if(isEmpty(this))
            return Integer.MIN_VALUE;
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
    public static void main(String[] args)
    {
        arrayQueue queue = new arrayQueue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() +
                " dequeued from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
    }
}
