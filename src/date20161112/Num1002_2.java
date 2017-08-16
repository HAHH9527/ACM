/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161112;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int mn = m * n;
            int[] all = new int[mn];
            for (int i = 0; i < mn; i++) {
                    all[i] = sc.nextInt();
            }
            int max = 0;
            int xy = 0;
            for (int i = 0; i < mn; i++) {
                    int temp;
                    if (all[i] > 0) {
                        temp = all[i];
                    } else {
                        temp = -all[i];
                    }
                    if (temp > max) {
                        max = temp;
                        xy = i;
                    }
            }
            int x = xy / n;
            int y = xy % n;
            System.out.println((x + 1) + " " + (y + 1) + " " + all[xy]);
        }
    }
}
