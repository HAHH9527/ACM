/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161224;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            double[][] arr = new double[n][3];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextDouble();
                arr[i][1] = sc.nextDouble();
                arr[i][2] = arr[i][0] / arr[i][1];
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j][2] < arr[j + 1][2]) {
                        double[] temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " " + arr[i][1]);
                if (i == n - 1) {
                    System.out.println("");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
