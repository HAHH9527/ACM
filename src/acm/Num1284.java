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
public class Num1284 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long s = n / 3 + 1;
            for (int i = 0; i <= n / 3; i++) {
                int t = (n - 3 * i) / 2;
                s += t;
            }
            System.out.println(s);
        }
    }
}
