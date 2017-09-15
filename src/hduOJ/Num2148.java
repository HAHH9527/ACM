package hduOJ;

import java.util.Scanner;

public class Num2148 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int t = sc.nextInt();
	    for (int i = 0; i < t; i++) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] score = new int[k - 1];
		for (int j = 0; j < k - 1; j++) {
		    score[j] = sc.nextInt();
		}
		int LeleScore = sc.nextInt();
		for (int j = 0; j < n - k; j++) {
		    int temp = sc.nextInt();
		    if (temp > LeleScore) {
			count++;
		    }
		}
		for (int j = 0; j < k - 1; j++) {
		    if (score[j] > LeleScore) {
			count++;
		    }
		}
		System.out.println(count);
	    }
	}
    }
}
