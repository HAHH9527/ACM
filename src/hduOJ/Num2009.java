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
public class Num2009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            int m = sc.nextInt();
            double answer = 0;
            for (int i = 0; i < m; i++) {
                answer += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f", answer);
            System.out.println("");
        }
    }
}
