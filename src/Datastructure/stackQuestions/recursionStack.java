package Datastructure.stackQuestions;
//using recursion
import java.util.Stack;

public class recursionStack {
    static Stack<Character> ch = new Stack<>();
    static void insert_at_bottom(char x) {
        if(ch.isEmpty())
            ch.push(x);
        else {
            char a = ch.peek();
            ch.pop();
            insert_at_bottom(x);
            ch.push(a);
        }
    }
    static void search(int element){
        Integer pos = ch.search(element);
        if(pos == -1)
            System.out.println("FOUND");
        else
            System.out.println("FOUND AT POSITION: " + pos);
    }
    static void reverse(){
        if(ch.size() > 0){
            char x = ch.peek();
            ch.pop();
            reverse();
            insert_at_bottom(x);
        }
    }

    public static void main(String[] args){
        ch.push('S');
        ch.push('H');
        ch.push('i');
        ch.push('v');
        ch.push('a');
        ch.push('1');
        ch.pop();
        System.out.println("PEEK is "+ ch.peek());
        System.out.println(ch);
        reverse();
        System.out.println(ch );
        System.out.println("SEARCH VALUE is " + ch.search('S'));
    }

}
