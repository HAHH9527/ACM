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
public class Num1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                int line = m * 3;
                for (int j = 0; j < line; j++) {
                    for (int k = 0; k < m; k++) {
                        System.out.print("HDU");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
