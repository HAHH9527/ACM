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
public class Num2006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            int answer = 1;
            for (int i = 0; i < count; i++) {
                int temp = sc.nextInt();
                if (temp % 2 == 1) {
                    answer = answer * temp;
                }
            }
            System.out.println(answer);
        }
    }
}
