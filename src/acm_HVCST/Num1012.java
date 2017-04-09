/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_HVCST;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] aswer = new int[5];
            int t = 0;
            for (int i = m; i <= n; i++) {
                int g = i % 10;
                int s = i / 10 % 10;
                int b = i / 100;
                if (i == g * g * g + s * s * s + b * b * b) {
                    aswer[t] = i;
                    t++;
                }
            }
            if (aswer[0] == 0) {
                System.out.println("no");
            } else {
                for (int i = 0; true; i++) {
                    System.out.print(aswer[i]);
                    if (aswer[i + 1] != 0) {
                        System.out.print(" ");
                    } else {
                        System.out.println("");
                        break;
                    }
                }
            }
        }
    }
}
