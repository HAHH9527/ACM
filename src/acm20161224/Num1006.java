/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm20161224;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int[] first = new int[3];
                for (int j = 0; j < 3; j++) {
                    first[j] = sc.nextInt();
                }
                int[] second = new int[3];
                for (int j = 0; j < 3; j++) {
                    second[j] = sc.nextInt();
                }
                if (first[0] > second[0]) {
                    System.out.println("First");
                } else if (first[0] < second[0]) {
                    System.out.println("Second");
                } else {
                    if (first[1] > second[1]) {
                        System.out.println("First");
                    } else if (first[1] < second[1]) {
                        System.out.println("Second");
                    } else {
                        if (first[2] > second[2]) {
                            System.out.println("First");
                        } else if (first[2] < second[2]) {
                            System.out.println("Second");
                        } else {
                            System.out.println("Same");
                        }
                    }
                }
            }
        }
    }
}
