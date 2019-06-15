package Datastructure;
//this is a stack implenetation in java with all opeations //

import java.util.Stack;

public class stack {
    //Stack has inbuilt data structure which can perform all operations
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 5; i++)
        {
            stack.push(i);
        }
    }
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop :");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("test:" + stack.pop());
        }
    }
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }
    // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);
        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    public static void main(String args[]){
            Stack<Integer> s = new Stack<Integer>();
            stack_push(s);
            stack_pop(s);
            stack_push(s);
            stack_peek(s);
            stack_search(s, 3);

    }
}
