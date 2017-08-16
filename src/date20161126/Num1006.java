/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int n = sc.nextInt();
                int t = 0;
                while (n != 1) {
                    if (n % 2 == 1) {
                        if (t == 0) {
                            System.out.print(n);
                        } else {
                            System.out.print(" " + n);
                        }
                        t++;
                        n = n * 3 + 1;
                    } else {
                        n = n / 2;
                    }
                }
                if (t == 0) {
                    System.out.println("No number can be output !");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}
