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
public class Num1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long x = 0;
            long y = 0;
            long m = sc.nextLong();
            long n = sc.nextLong();
            if (m > n) {
                long t = m;
                m = n;
                n = t;
            }
            for (long i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    x += (i * i);
                } else {
                    y += (i * i * i);
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
