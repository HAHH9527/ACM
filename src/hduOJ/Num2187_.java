/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num2187_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] arr = new int[m][2];
                for (int j = 0; j < m; j++) {
                    arr[j][0] = sc.nextInt();
                    arr[j][1] = sc.nextInt();
                }
                for (int j = 0; j < m - 1; j++) {
                    for (int k = 0; k < m - 1 - k; k++) {
                        if (arr[k][0] > arr[k + 1][0]) {
                            int[] temp = arr[k];
                            arr[k] = arr[k + 1];
                            arr[k + 1] = temp;
                        }
                    }
                }
                double count = 0;
                for (int j = 0; j < m; j++) {
                    if (arr[j][0] * arr[j][1] >= n) {
                        count += n * 1.0 / arr[j][1];
                        break;
                    } else {
                        count += arr[j][1];
                        n -= arr[j][0] * arr[j][1];
                    }
                }
                System.out.printf("%.2f", count);
                System.out.println("");
            }
        }
    }
}
