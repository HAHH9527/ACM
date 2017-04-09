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
public class Num1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int aswer = 1;
            if (a == 0 && b == 0) {
            } else {
                for (int i = 1; i <= b; i++) {
                    aswer = aswer * a;
                    if (aswer >= 1000) {
                        aswer = aswer % 1000;
                    }
                }
                System.out.println(aswer);
            }
        }
    }
}
