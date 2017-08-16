/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date20161126;

import java.util.Scanner;

/**
 *
 * @author 9527number
 */
public class Num1005_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int m = sc.nextInt();
            int g = sc.nextInt();
            int[] score = new int[m];
            for (int i = 0; i < m; i++) {
                score[i] = sc.nextInt();
            }
            String[] number = new String[n];
            int[] aScore = new int[n];
            int people = 0;
            boolean[] flag = new boolean[n];
            for (int i = 0; i < n; i++) {
                flag[i] = false;
                number[i] = sc.next();
                int t = sc.nextInt();
                aScore[i] = 0;
                for (int j = 0; j < t; j++) {
                    int tNum = sc.nextInt();
                    aScore[i] += score[tNum - 1];
                }
                if (aScore[i] >= g) {
                    people++;
                    flag[i] = true;
                }
            }
            System.out.println(people);
            String[] acPeople = new String[people];
            int[] acScore = new int[people];
            int temp = 0;
            for (int i = 0; i < n; i++) {
                if (flag[i]) {
                    acPeople[temp] = number[i];
                    acScore[temp] = aScore[i];
                    temp++;
                    if (temp == people) {
                        break;
                    }
                }
            }
            for (int i = 0; i < people - 1; i++) {
                for (int j = 0; j < people - 1 - i; j++) {
                    if (acScore[j] < acScore[j + 1]) {
                        int tempScore = acScore[j];
                        acScore[j] = acScore[j + 1];
                        acScore[j + 1] = tempScore;
                        String tempNum = acPeople[j];
                        acPeople[j] = acPeople[j + 1];
                        acPeople[j + 1] = tempNum;
                    } else if (acScore[j] == acScore[j + 1]) {
                        if (acPeople[j].compareTo(acPeople[j + 1]) > 0) {
                            String tempNum = acPeople[j];
                            acPeople[j] = acPeople[j + 1];
                            acPeople[j + 1] = tempNum;
                        }
                    }
                }
            }
            for (int i = 0; i < people; i++) {
                System.out.println(acPeople[i] + " " + acScore[i]);
            }
        }
    }
}
