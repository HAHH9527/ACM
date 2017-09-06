/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1163 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int temp = n;
            for (int i = 1; i < n; i++) {
                temp = temp * n;
                while (temp > 9) {
                    temp = temp % 9;
                    if (temp == 0) {
                        temp = 9;
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
