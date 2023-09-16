package Sorting;

import java.util.Scanner;

public class counting_sort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        countingSort(arr);
        printArr(arr);
    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // frequency
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0; // element
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
