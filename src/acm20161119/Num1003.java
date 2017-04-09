/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161119;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] candy = new int[n];
                int max = 0;
                for (int j = 0; j < candy.length; j++) {
                    candy[j] = sc.nextInt();
                    if (candy[j] > max) {
                        max = candy[j];
                    }
                }
                boolean flag = false;
                int sum = 0;
                for (int j = 0; j < candy.length; j++) {
                    sum += candy[j];
                    if (sum - max >= max - 1) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
