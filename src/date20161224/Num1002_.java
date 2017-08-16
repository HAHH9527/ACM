/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161224;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                int sum = n;
                for (int j = 1; j < m; j++) {
                    n = n * (n - 1) / 2;
                }
                System.out.println(n);
            }
        }
    }
}
