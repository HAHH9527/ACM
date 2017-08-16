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
public class Num1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = x;
            int b = y;
            if (x > y) {
                a = y;
                b = x;
            }
            int max = 0;
            for (int i = a; i <= b; i++) {
                int n = i;
                int t = 1;
                while (n != 1) {
                    if (n % 2 == 1) {
                        n = n * 3 + 1;
                    } else {
                        n = n / 2;
                    }
                    t++;
                }
                if (t > max) {
                    max = t;
                }
            }
            System.out.println(x + " " + y + " " + max);
        }
    }
}
