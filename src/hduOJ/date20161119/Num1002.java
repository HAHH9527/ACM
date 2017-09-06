/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161119;

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
            double sum1 = 0;
            double sum2 = 0;
            for (int i = 0; i < n; i++) {
                double s = sc.nextDouble();
                double p = sc.nextDouble();
                if (p != -1) {
                    sum1 += s;
                    if (p >= 90) {
                        sum2 += s * 4;
                    } else if (p >= 80) {
                        sum2 += s * 3;
                    } else if (p >= 70) {
                        sum2 += s * 2;
                    } else if (p >= 60) {
                        sum2 += s * 1;
                    } else {
                        sum2 += s * 0;
                    }
                }
            }
            if (sum2 == 0) {
                System.out.print("-1");
            } else {
                System.out.printf("%.2f", sum2 / sum1);
            }
            System.out.println("");
        }
    }
}
