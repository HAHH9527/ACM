/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int M1 = sc.nextInt();
            int M2 = sc.nextInt();
            int R1 = 0, R2 = 0, R3 = 0;
            String str = sc.next();
            char[] ml = str.toCharArray();
            for (int i = 0; i < ml.length; i++) {
                switch (ml[i]) {
                    case 'A':
                        R1 = M1;
                        break;
                    case 'B':
                        R2 = M2;
                        break;
                    case 'C':
                        M1 = R3;
                        break;
                    case 'D':
                        M2 = R3;
                        break;
                    case 'E':
                        R3 = R1 + R2;
                        break;
                    case 'F':
                        R3 = R1 - R2;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(M1 + "," + M2);
        }
    }
}
