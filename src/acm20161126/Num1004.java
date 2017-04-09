/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = sc.nextInt();
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == temp) {
                    flag++;
                }
            }
            System.out.println(flag);
        }
    }
}
