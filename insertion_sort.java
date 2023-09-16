package Sorting;

import java.util.Scanner;

public class insertion_sort {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
