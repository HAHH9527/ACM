/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161210;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[2005];
                int[] x = new int[n];
                for (int j = 0; j < n; j++) {
                    x[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    for (int l = j + 1; l < n; l++) {
                        int temp = x[j] - x[l];
                        if (temp < 0) {
                            temp = -temp;
                        }
                        arr[temp]++;
                    }
                }
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        k--;
                        if (k == 0) {
                            System.out.println(j);
                            break;
                        }
                    }
                }
            }
        }
    }
}
