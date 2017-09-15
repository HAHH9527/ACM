/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 * @author 9527number
 */
public class Test {

    public static int removeElement(int A[], int n, int elem) {
        int index = n;
        for (int i = 0; i < n; i++) {
            if (A[i] == elem) {
                index--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            int elem = sc.nextInt();
            int index = removeElement(A, n, elem);
            System.out.println(index);
        }
    }
}
