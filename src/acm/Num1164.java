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
public class Num1164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int count = 0;
            for (int i = 2; i <= x; i++) {
                if (x % i == 0) {
                    if (count != 0) {
                        System.out.print("*");
                    }
                    System.out.print(i);
                    x = x / i;
                    i = 1;
                    count++;
                    if (x == 1) {
                        break;
                    }
                }
            }
            System.out.println("");
        }
    }
}
