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
public class Num1006 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String str1 = sc.next();
                String str2 = sc.next();
                char[] arr = str1.toCharArray();
                for (int j = 0; j < arr.length / 2; j++) {
                    System.out.print(arr[j]);
                }
                System.out.print(str2);
                for (int j = arr.length / 2; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println("");
            }
        }
    }
}
