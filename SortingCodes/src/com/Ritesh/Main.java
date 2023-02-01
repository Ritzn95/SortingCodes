package com.Ritesh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Limit of the arrays: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        selection(arr);
        bubble(arr1);
        insertion(arr2);
        System.out.println("Sorted array using selection sort: " + Arrays.toString(arr));
        System.out.println("Sorted array using bubble sort: " + Arrays.toString(arr1));
        System.out.println("Sorted array using insertion sort: " + Arrays.toString(arr2));
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }

        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void bubble(int[] arr){
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
}
