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
public class Num2186 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                int n = sc.nextInt();
                int a = n / 2;
                n -= a;
                int b = n * 2 / 3;
                n -= b;
                int count = 0;
                for (int j = a; j > 0; j -= 10) {
                    count++;
                }
                for (int j = b; j > 0; j -= 10) {
                    count++;
                }
                for (int j = n; j > 0; j -= 10) {
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
