/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161119;

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
            for (int j = 0; j < n; j++) {
                String str = sc.next();
                char a[] = str.toCharArray();
                for (int i = 0; i < str.length(); i += 2) {
                    char temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i]);
                }
                System.out.println();
            }
        }
    }
}
