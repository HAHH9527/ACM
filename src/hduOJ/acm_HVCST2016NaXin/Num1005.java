/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.acm_HVCST2016NaXin;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                double sum = 0;
                double t = 1;
                for (int j = 1; j <= n; j++) {
                    if (j % 2 != 0) {
                        sum += t / j;
                    } else {
                        sum -= t / j;
                    }
                }
                System.out.printf("%.2f", sum);
                System.out.println("");
            }
        }
    }
}
