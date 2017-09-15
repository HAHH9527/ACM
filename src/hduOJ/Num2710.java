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
public class Num2710 {

    static int[] pf = new int[20005];

    public static void f() {
        pf[1] = 1;
        for (int i = 2; i <= 20000; i++) {
            if (pf[i] == 0) {
                pf[i] = i;
                for (int j = 2; j * i <= 20000; j++) {
                    pf[j * i] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        f();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                if (pf[m] > pf[max]) {
                    max = m;
                }
            }
            System.out.println(max);
        }
    }
}
