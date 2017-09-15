package hduOJ;

import java.util.Scanner;

public class Num2101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b) % 86 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
