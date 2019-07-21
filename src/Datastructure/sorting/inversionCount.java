package Datastructure.sorting;

public class inversionCount {

    static int mergeSort(int[] arr, int arr_size){
        int[]temp = new int[arr_size];
        return pureMerge(arr, temp, 0, arr_size - 1);
    }
    static int pureMerge(int[] arr, int temp[], int left, int right){
        int mid, inv_count = 0;
        if(right > left){
            mid = (right+left)/2;
            inv_count = pureMerge(arr, temp, left, mid);
            inv_count = pureMerge(arr, temp, mid+1, right);
            inv_count+= merge(arr, temp, left, mid+1, right);
        }
        return inv_count;
    }

    static int merge(int[]arr, int temp[], int left, int mid, int right){
        int i,j, k;
        int invCount = 0;
        i=left;
        j=right;
        k=left;
        while ((i <= mid-1) && (j <= right)){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount = invCount + (mid - i);
            }
        }
        while (i <= mid - 1)
            temp[k++] = arr[i++];
        while (j <= right)
            temp[k++] = arr[j++];
        for (i = left; i <= right; i++)
            arr[i] = temp[i];
        return invCount;
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 20, 6, 4, 5 };
        System.out.println("Number of inversions are " + mergeSort(arr, 5));
    }
}
