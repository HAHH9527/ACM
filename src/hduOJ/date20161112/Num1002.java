/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161112;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] all = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    all[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            int x = 0;
            int y = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int temp;
                    if (all[i][j] > 0) {
                        temp = all[i][j];
                    } else {
                        temp = -all[i][j];
                    }
                    if (temp > max) {
                        max = temp;
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println((x + 1) + " " + (y + 1) + " " + all[x][y]);
        }
    }
}
