/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161224;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double y = sc.nextDouble();
                double q = sc.nextDouble();
                double e = sc.nextDouble();
                double f = sc.nextDouble();
                double g = sc.nextDouble();
                double temp1 = y * e / 100 * q / 365 + y;
                temp1 = temp1 * (1 + g / 100);
                double temp2 = y * (1 + f / 100 * (q + 365) / 365);
                System.out.printf("%.1f", temp1);
                System.out.println("");
                System.out.printf("%.1f", temp2);
                System.out.println("");
            }
        }
    }
}
