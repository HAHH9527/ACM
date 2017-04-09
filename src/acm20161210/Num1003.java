/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161210;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double u = sc.nextDouble();
                double v = sc.nextDouble();
                double w = sc.nextDouble();
                double l = sc.nextDouble();
                System.out.printf("%.3f", l / (u + v) * w);
                System.out.println("");
            }
        }
    }
}
