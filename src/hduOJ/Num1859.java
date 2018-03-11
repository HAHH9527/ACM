package hduOJ;

import java.util.Scanner;

public class Num1859 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = 0;
            int y = 0;
            int maxX = 0;
            int minX = 0;
            int maxY = 0;
            int minY = 0;
            while (true) {
                x = sc.nextInt();
                y = sc.nextInt();
                if (x == 0 && y == 0) {
                    break;
                }
                if (maxX == 0 && minX == 0 && maxY == 0 && minY == 0) {
                    maxX = minX = x;
                    maxY = minY = y;
                } else {
                    if (x > maxX) {
                        maxX = x;
                    }
                    if (x < minX) {
                        minX = x;
                    }
                    if (y > maxY) {
                        maxY = y;
                    }
                    if (y < minY) {
                        minY = y;
                    }
                }
            }
            if (maxX == 0 && minX == 0 && maxY == 0 && minY == 0) {
                continue;
            } else {
                System.out.println(minX + " " + minY + " " + maxX + " " + maxY);
            }
        }
    }
}
