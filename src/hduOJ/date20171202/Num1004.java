package hduOJ.date20171202;

import java.util.Scanner;

public class Num1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int max = 0;
            int maxX = 0;
            int maxY = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = sc.nextInt();
                    if (Math.abs(temp) > Math.abs(max)) {
                        max = temp;
                        maxX = i;
                        maxY = j;
                    }
                }
            }
            System.out.println((maxX + 1) + " " + (maxY + 1) + " " + max);
        }
    }
}
