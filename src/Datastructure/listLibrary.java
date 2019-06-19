package Datastructure;

import java.util.LinkedList;

public class listLibrary {
    public static void main(String[] args){
        LinkedList<Integer> n = new LinkedList<>();
        n.add(3);
        n.add(32);
        n.add(37);
        n.addLast(13);
        n.addFirst(33);
        n.add(4);
        n.addFirst(5);
        System.out.println("LINKED LIST " + n);
        n.remove(3);
        n.removeFirst();
        System.out.println("After Deletion: " + n);

        //find element in list using javautils
        boolean status = n.contains(4);
        if(status)
            System.out.println("it contains");
        else
            System.out.println("Not found");
        //finding size
        int len = n.size();
        System.out.println("Size of list is : " + len);
        //to get and set elements
        Object ele = n.get(4);
        System.out.println("returned element is " + ele);
    }

}
