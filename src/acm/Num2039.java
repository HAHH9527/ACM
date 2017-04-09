/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num2039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                double[] l = new double[3];
                for (int j = 0; j < l.length; j++) {
                    l[j] = sc.nextDouble();
                }
                for (int j = 0; j < l.length - 1; j++) {
                    for (int k = 0; k < l.length - 1 - j; k++) {
                        if (l[k] < l[k + 1]) {
                            double temp = l[k];
                            l[k] = l[k + 1];
                            l[k + 1] = temp;
                        }
                    }
                }
                if (l[0] < l[1] + l[2]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
