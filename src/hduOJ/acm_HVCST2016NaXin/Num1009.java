/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.acm_HVCST2016NaXin;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[55];
            a[1] = 1;
            a[2] = 2;
            a[3] = 3;
            if (n == 0) {
            } else if (n == 1) {
                System.out.println(a[1]);
            } else if (n == 2) {
                System.out.println(a[2]);
            } else if (n == 3) {
                System.out.println(a[3]);
            } else {
                for (int i = 1; i <= n - 3; i++) {
                    a[i + 3] = a[i + 2] + a[i];
                }
                System.out.println(a[n]);
            }
        }
    }
}
