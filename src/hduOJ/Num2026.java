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
public class Num2026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            if (arr[0] >= 'a' && arr[0] <= 'z') {
                arr[0] = (char) (arr[0] - 32);
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' ' && i != arr.length - 1) {
                    if (arr[i + 1] >= 'a' && arr[i + 1] <= 'z') {
                        arr[i + 1] = (char) (arr[i + 1] - 32);
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("");
        }
    }
}
