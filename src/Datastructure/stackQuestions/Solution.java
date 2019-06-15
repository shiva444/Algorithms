package Datastructure.stackQuestions;

import java.util.Stack;
public class Solution {
    Stack<Integer> s = new Stack<>();
    int min = Integer.MAX_VALUE;

    void push(int x) {
        //checking base condition
        if(s.isEmpty()) {
            min = x;
            System.out.println("FIRST pushed element is :" + s.push(x) );
        } else {
            if(x < min) {
                s.push(x - min);
                min = x;
            } else {
                System.out.println("pushed element is :" + s.push(x));
            }
        }
    }

    void pop() {
        if(!s.isEmpty()) {
            if(s.peek() >= min)
                System.out.println("POPPED ELEMENT: " + s.pop());
            else min = min - s.pop();
        }
    }

     int top() {
        if(s.isEmpty())
            return -1;
        if(s.peek() > min)
            return s.peek();
        else return min;
    }

     int getMin() {
        if(s.isEmpty())
            return -1;
        return min;
    }
    public static void main(String args[]){
        Solution res = new Solution();
        res.push(12);
        res.push(132);
        res.push(122);
        res.push(112);
        res.push(121);
        res.pop();
        System.out.println("MIN element is :" + res.getMin());
        System.out.println("FINAL: " + res.top());
    }
}
