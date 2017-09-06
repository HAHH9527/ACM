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
public class Num2014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            double[] arr = new double[count];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextDouble();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        double temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            double sum = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                sum += arr[i];
            }
            System.out.printf("%.2f", sum / (count - 2));
            System.out.println("");
        }
    }
}
