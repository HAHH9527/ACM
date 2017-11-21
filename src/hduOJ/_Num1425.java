/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class _Num1425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sort(arr, 0, arr.length - 1);
            System.out.print(arr[0]);
            for (int i = 1; i < m; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println("");
        }
    }

    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];

        while (end > start) {
            while (end > start && a[end] <= key) {
                end--;
            }
            if (a[end] >= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (end > start && a[start] >= key) {
                start++;
            }
            if (a[start] <= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if (start > low) {
            sort(a, low, start - 1);
        }
        if (end < high) {
            sort(a, end + 1, high);
        }
    }
}
