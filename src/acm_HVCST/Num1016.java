/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_HVCST;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String temp = sc.nextLine();
            for (int i = 1; i <= n; i++) {
                String t = sc.nextLine();
                int a = 0;
                char[] arr = t.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] >= 48 && arr[j] <= 57) {
                        a++;
                    }
                }
                System.out.println(a);
            }
        }
    }
}
