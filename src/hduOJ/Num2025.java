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
public class Num2025 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            char max = 'a';
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (arr[i] == max) {
                    System.out.print("(max)");
                }
            }
            System.out.println("");
        }
    }
}
