/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161112;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1001 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[41];
        t[1] = t[2] = 1;
        for (int i = 3; i <= 40; i++) {
            t[i] = t[i - 1] + t[i - 2];
        }
        while (sc.hasNext()) {
            int n = sc.nextInt();
            while (n > 0) {
                int m = sc.nextInt();
                System.out.println(t[m]);
                n--;
            }
        }
    }
}
