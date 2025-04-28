package basicRecursion;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("original Array");
        for (int i : arr)
            System.out.print(i + " ");

        reverse(arr, 0, arr.length-1);
        System.out.println("\nreversed Array");
        for (int i : arr)
            System.out.print(i + " ");

    }
    public static void reverse(int[] arr, int start, int end){

        if (start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);

    }
}
