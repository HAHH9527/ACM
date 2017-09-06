/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.acm_HVCST2016NaXin;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T = sc.nextInt();
            for (int t = 1; t <= T; t++) {
                int n = sc.nextInt();
                for (int i = 0; i < (n - 1) / 2; i++) {
                    for(int ii = 0; ii < i; ii++){
                        System.out.print(" ");
                    }
                    System.out.print("X");
                    for(int ii = 0; ii < n - ((i + 1) * 2); ii++){
                        System.out.print(" ");
                    }
                    System.out.println("X");
                }
                for (int i = 0; i < (n - 1) / 2; i++) {
                    System.out.print(" ");
                }
                System.out.println("X");
                for (int i = 0; i < (n - 1) / 2; i++) {
                    for(int ii = 0; ii < (n / 2) - i - 1; ii++){
                        System.out.print(" ");
                    }
                    System.out.print("X");
                    for(int ii = 0; ii < ((i * 2) + 1); ii++){
                        System.out.print(" ");
                    }
                    System.out.println("X");
                }
                System.out.println("");
            }
        }
    }
}
