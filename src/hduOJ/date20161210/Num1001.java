/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161210;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[][] temp = new int[n][2];
                for (int j = 0; j < temp.length; j++) {
                    temp[j][0] = sc.nextInt();
                    temp[j][1] = sc.nextInt();
                }
                pl(temp);
                for (int j = 0; j < temp.length; j++) {
                    display(temp[j][0], temp[j][1]);
                }
            }
        }
    }

    public static void pl(int[][] n) {
        for (int j = 0; j < n.length - 1; j++) {
            for (int k = 0; k < n.length - 1 - j; k++) {
                if (n[k][0] > n[k + 1][0]) {
                    int[] temp = n[k];
                    n[k] = n[k + 1];
                    n[k + 1] = temp;
                }
            }
        }
    }

    public static void display(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.print(">+");
            for (int j = 0; j < a - 2; j++) {
                System.out.print("-");
            }
            System.out.println("+>");
        }
        System.out.println("");
    }
}
