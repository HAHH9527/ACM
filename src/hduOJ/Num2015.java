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
public class Num2015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2;
        }
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            int sum = 0;
            int time = 0;
            for (int i = 0; i < m; i++) {
                sum += arr[i];
                count++;
                if (count == n) {
                    if (time != 0) {
                        System.out.print(" ");
                    }
                    time++;
                    System.out.print(sum / count);
                    sum = 0;
                    count = 0;
                }
                if (i == m - 1 && count != 0) {
                    if (time != 0) {
                        System.out.print(" ");
                    }
                    System.out.print(sum / count);
                }
            }
            System.out.println("");
        }
    }
}
