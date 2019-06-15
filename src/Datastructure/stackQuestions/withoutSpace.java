package Datastructure.stackQuestions;

import java.util.Scanner;

public class withoutSpace {
    static void swap(char a[], int index1, int index2) {
        char temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // A stack based function to reverese a string
    static void reverse(char str[]) {
        // get size of string
        int n = str.length, i;

        for (i = 0; i < n / 2; i++) {
            swap(str, i, n - i - 1);
        }
    }
    // Driver program to test above functions
    public static void main(String[] args) {
        System.out.println("ENTER string to reverse: ");
        Scanner test = new Scanner(System.in);
        String st = test.nextLine();
        char str[] = st.toCharArray();
        reverse(str);
        System.out.println("Reverse string is : " + String.valueOf(str));
    }

}
