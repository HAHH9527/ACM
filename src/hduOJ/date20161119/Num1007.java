/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161119;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int temp = 0;
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n - j; k++) {
                        if (j * 1 + k * 2 + (n - j - k) * 5 == m) {
                            temp++;
                        }
                    }
                }
                System.out.println(temp);
            }
        }
    }
}
