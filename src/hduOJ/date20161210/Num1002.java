/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161210;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                String str = sc.next();
                int n = sc.nextInt();
                String[] arr = str.split("\\.");
                char[] c = arr[1].toCharArray();
                try {
                    System.out.println(c[n - 1]);
                } catch (Exception e) {
                    System.out.println("0");
                }
            }
        }
    }
}
