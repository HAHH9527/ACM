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
public class Num2021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                continue;
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += count(sc.nextInt());
            }
            System.out.println(count);
        }
    }

    public static int count(int money) {
        int count = 0;
        while (money >= 100) {
            count++;
            money -= 100;
        }
        while (money >= 50) {
            count++;
            money -= 50;
        }
        while (money >= 10) {
            count++;
            money -= 10;
        }
        while (money >= 5) {
            count++;
            money -= 5;
        }
        while (money >= 2) {
            count++;
            money -= 2;
        }
        while (money >= 1) {
            count++;
            money -= 1;
        }
        return count;
    }
}
