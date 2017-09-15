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
public class Num2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] score = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    score[i][j] = sc.nextInt();
                }
            }
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (flag) {
                    flag = false;
                } else {
                    System.out.print(" ");
                }
                double sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += score[i][j];
                }
                System.out.printf("%.2f", sum / m);
            }
            System.out.println("");
            flag = true;
            double[] ave = new double[m];
            for (int i = 0; i < m; i++) {
                if (flag) {
                    flag = false;
                } else {
                    System.out.print(" ");
                }
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += score[j][i];
                }
                ave[i] = sum / n;
                System.out.printf("%.2f", ave[i]);
            }
            System.out.println("");
            int count = n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (score[i][j] < ave[j]) {
                        count--;
                        break;
                    }
                }
            }
            System.out.println(count);
            System.out.println("");
        }
    }
}
