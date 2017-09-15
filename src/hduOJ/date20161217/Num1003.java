/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161217;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = a * d + c * b;
                int f = b * d;
                int temp = maxGYS(e, f);
                e = e / temp;
                f = f / temp;
                System.out.println(e + " " + f);
            }
        }
    }

    public static int maxGYS(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a % b != 0) {
            int temp = a % b;
            if (temp < b) {
                a = b;
                b = temp;
            } else {
                a = temp;
            }
        }
        return b;
    }
}
