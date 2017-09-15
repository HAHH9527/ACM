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
public class Num2008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            if (count == 0) {
                continue;
            }
            int positiveCount = 0;
            int zeroCount = 0;
            int negativeCount = 0;
            for (int i = 0; i < count; i++) {
                double temp = sc.nextDouble();
                if (temp > 0) {
                    positiveCount++;
                } else if (temp == 0) {
                    zeroCount++;
                } else if (temp < 0) {
                    negativeCount++;
                }
            }
            System.out.println(negativeCount + " " + zeroCount + " " + positiveCount);
        }
    }
}
