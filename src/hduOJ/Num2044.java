/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num2044 {

    public static void main(String[] args) {
        long[] fbnq = new long[51];
        fbnq[0] = 0;
        fbnq[1] = 1;
        for (int i = 2; i < fbnq.length; i++) {
            fbnq[i] = fbnq[i - 1] + fbnq[i - 2];
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(fbnq[b - a + 1]);
            }
        }
    }
}
