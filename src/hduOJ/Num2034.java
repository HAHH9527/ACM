/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num2034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int m = sc.nextInt();
            int[] b = new int[m];
            if (n == 0 && m == 0) {
                break;
            }
            boolean[] flag = new boolean[100];
            for (int i = 0; i < 100; i++) {
                flag[i] = false;
            }
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }
            int time = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i] == b[j]) {
                        flag[i] = true;
                        time++;
                        break;
                    }
                }
            }
            int l = n - time;
            int[] out = new int[l];
            for (int i = 0; i < n; i++) {
                if (flag[i] == false) {
                    l--;
                    out[l] = a[i];
                }
            }
            for (int i = 0; i < out.length - 1; i++) {
                for (int j = 0; j < out.length - 1 - i; j++) {
                    if (out[j] > out[j + 1]) {
                        int temp = out[j];
                        out[j] = out[j + 1];
                        out[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i] + " ");
            }
            if (n - time == 0) {
                System.out.print("NULL");
            }
            System.out.println("");
        }
    }
}
