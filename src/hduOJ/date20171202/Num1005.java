package hduOJ.date20171202;

import java.util.Scanner;

public class Num1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) continue;
            int[] arr = new int[n];
            arr[0] = sc.nextInt();
            int min = arr[0];
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[0];
            arr[0] = min;
            System.out.print(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }
    }
}
