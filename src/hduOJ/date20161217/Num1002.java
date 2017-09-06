/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161217;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                for (int c = b * 2; true; c += b) {
                    int temp1 = 0;
                    int temp2 = 0;
                    if (a > c) {
                        temp1 = a;
                        temp2 = c;
                    } else {
                        temp1 = c;
                        temp2 = a;
                    }
                    int temp = 0;
                    while (temp1 % temp2 != 0) {
                        temp = temp1 % temp2;
                        temp1 = temp2;
                        temp2 = temp;
                    }
                    if (temp2 == b) {
                        System.out.println(c);
                        break;
                    }
                }
            }
        }
    }
}
