/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ.date20161112;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String temp = sc.nextLine();
            while (n > 0) {
                String str = sc.nextLine();
                char[] arr = str.toCharArray();
                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < 0 || arr[i] > 255) {
                        count++;
                    }
                }
                System.out.println(count);
                n--;
            }
        }
    }
}
