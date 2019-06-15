//Stack implementation using an array.
public class Main {

    int MAX = 1000;
    int top ;
    int a[] = new int[MAX];
    Main(){
        top = -1;
    }

    boolean push(int x){
        if(top == MAX - 1){
            System.out.println("overflow");
            return false;
        } else{
            a[++top] = x;
            System.out.println("pushed array :" + x);
            return true;
        }
    }
    int pop(){
        if(top == -1){
            System.out.println("Underflow");
            return 0;
        } else {
            int x = a[top --];
            return x;
        }
    }

    int top(){
        return a[top];
    }


    boolean empty(){
        if(top == 1)
            return true;
        else
            return false;
    }
    public static void main(String [] args){
        Main s = new Main();
        s.push(12);
        s.push(14);
        s.push(14);
        s.push(14);
        s.push(134);
        s.push(114);
        System.out.println("POPPED ELEMENT:" + s.pop());
        System.out.println("Stack is Empty :" + s.empty() +  "TOP ARRAY:" + s.top);
    }
}
