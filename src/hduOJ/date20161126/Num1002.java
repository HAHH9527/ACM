/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            bs(arr);
            if (n % 2 != 0) {
                System.out.println(arr[n / 2]);
            } else {
                System.out.println((arr[n / 2 - 1] + arr[n / 2]) / 2.0);
            }
        }
    }

    public static void bs(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }
}
