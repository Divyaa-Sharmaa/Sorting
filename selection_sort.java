package Sorting;

import java.util.Scanner;

public class selection_sort {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();
        int[] arr = new int[num];
        inputArr(arr);
        selectionSort(arr);
        printArr(arr);
    }

    public static void inputArr(int[] arr){
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j])
                   minPos = j;
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
