/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161119;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                int n = sc.nextInt();
                int t = 0;
                while (true) {
                    if (n == 0) {
                        System.out.println(t);
                        break;
                    } else if (n % 2 == 0) {
                        n = n / 2;
                    } else if (n % 2 != 0) {
                        n = n - 1;
                        t++;
                    }
                }
            }
        }
    }
}
