package Datastructure.array;

//array practice question with all operations

import java.util.Arrays;

public class array  {
     static void printArray(int[] array){
         int printArray = 0;
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            int item = array[i];
            printArray+= array[i];
            System.out.println("sum of array values : " + printArray);
            System.out.print(item);
            if (i < array.length -1){
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        /*array is 0 based index,
        largest index = length -1
         */
        int[] array;
        int[] array1 = new int[6];
        int[] array2 = {5,6,7,8,3};
        String[] sList = {"Books, coffee, read, code, repeat"};
        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 15;
        array1[3] = 20;
        array1[4] = 25;
        array1[5] = 30;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        printArray(array1);
        printArray(array2);
        System.out.println(array2[3]);
        Arrays.sort(array1);
        printArray(array1);
        //for each
        for (String s: sList) {
            System.out.println(s);
        }
        /* two-Dime arrays */
        int arr[][] = {{3,4,5}, {4,6,7}, {1,2,3}};
        //print 2d array
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.println(arr[i][j] + " ");
                System.out.println();
            }
        }
        //sum of array values
        System.out.println();

    }
}
