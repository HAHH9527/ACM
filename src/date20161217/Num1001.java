/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161217;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1001 {

    public static double jc(double n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return jc(n - 1) * n;
    }

    public static void main(String[] args) {
        double[] x = new double[31];
        for (int i = 0; i < x.length; i++) {
            x[i] = jc(i);
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                double out = 0;
                if (n < m) {
                    out = 0;
                } else {
                    double temp = x[n] / x[n - m] / x[m];
                    out = temp;
                }
                System.out.printf("%.0f",out);
                System.out.println("");
            }
        }
    }
}
