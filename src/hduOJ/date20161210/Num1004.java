/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161210;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double d = sc.nextDouble();
                System.out.printf("%.1f", Math.sqrt((a - c) * (a - c) + (b - d) * (b - d)));
                System.out.println("");
            }
        }
    }
}
