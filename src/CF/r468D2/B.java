package CF.r468D2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        if (n == 2) {
            count = 1;
        } else if (n == 4) {
            count = 2;
        } else if (n == 8) {
            count = 3;
        } else if (n == 16) {
            count = 4;
        } else if (n == 32) {
            count = 5;
        } else if (n == 64) {
            count = 6;
        } else if (n == 128) {
            count = 7;
        } else if (n == 256) {
            count = 8;
        }
        int round = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        boolean flag = false;
        while (true) {// 每回合
            round++;
            int arr2[] = new int[arr.length / 2];
            for (int i = 0; i < arr2.length; i++) {
                int j = i * 2;
                if (arr[j] == a && arr[j + 1] == b || arr[j] == b && arr[j + 1] == a) {
                    flag = true;
                    break;
                }
                if (arr[j] != a && arr[j] != b) {
                    arr2[i] = arr[j + 1];
                } else {
                    arr2[i] = arr[j];
                }
            }
            if (flag) {
                break;
            }
            arr = arr2;
        }
        if (round == count) {
            System.out.print("Final!");
        } else {
            System.out.print(round);
        }
    }
}