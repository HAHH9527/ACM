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
public class Num2042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int sum = 3;
                for (int j = 0; j < a; j++) {
                    sum = (sum - 1) * 2;
                }
                System.out.println(sum);
            }
        }
    }
}
