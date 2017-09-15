/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hduOJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 9527number
 */
public class Num2535 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] people = new int[n];
            for (int i = 0; i < n; i++) {
                people[i] = sc.nextInt();
            }
            Arrays.sort(people);
            int temp = n / 2 + 1;
            int sum = 0;
            for (int i = 0; i < temp; i++) {
                sum += people[i] / 2 + 1;
            }
            System.out.println(sum);
        }
    }
}
