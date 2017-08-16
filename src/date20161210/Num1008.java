/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161210;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int max = 0;
                int out = 0;
                for (int j = a; j <= b; j++) {
                    int temp = ys(j);
                    if (temp > max) {
                        max = temp;
                        out = j;
                    }
                }
                System.out.println(out);
            }
        }
    }
    
    public static int ys(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
