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
public class Num2002 {

    public static void main(String[] args) {
        final double pi = 3.1415927;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double r = sc.nextDouble();
            double s = pi * r * r * r * 4.0 / 3.0;
            System.out.printf("%.3f", s);
            System.out.println("");
        }
    }
}
