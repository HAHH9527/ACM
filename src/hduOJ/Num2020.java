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
public class Num2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                continue;
            }
            int[] arr = new int[n];
            int[] arrAbs = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    arrAbs[i] = -arr[i];
                } else {
                    arrAbs[i] = arr[i];
                }
            }
            for (int i = 0; i < arrAbs.length - 1; i++) {
                for (int j = 0; j < arrAbs.length - 1 - i; j++) {
                    if (arrAbs[j] < arrAbs[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        int tempAbs = arrAbs[j];
                        arrAbs[j] = arrAbs[j + 1];
                        arrAbs[j + 1] = tempAbs;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i]);
            }
            System.out.println("");
        }
    }
}
