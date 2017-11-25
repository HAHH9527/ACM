package hduOJ.date20171125;

import java.util.Scanner;

public class Num1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int count = 0;
                int N = sc.nextInt();
                int K = sc.nextInt();
                int[] score = new int[K - 1];
                for (int i1 = 0; i1 < score.length; i1++) {
                    score[i1] = sc.nextInt();
                }
                int LeleScore = sc.nextInt();
                for (int i1 = 0; i1 < N - K; i1++) {
                    int temp = sc.nextInt();
                    if (temp > LeleScore) {
                        count++;
                    }
                }
                for (int i1 = 0; i1 < score.length; i1++) {
                    if (score[i1] > LeleScore) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
