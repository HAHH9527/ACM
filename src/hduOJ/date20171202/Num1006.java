package hduOJ.date20171202;

import java.util.Scanner;

public class Num1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 && y == 0) {
                continue;
            }
            boolean flag = false;
            for (int i = x; i <= y; i++) {
                int temp = i * i + i + 41;
                for (int j = 2; j < temp; j++) {
                    if (temp % j == 0) {
                        flag = true;
                        break;
                    }
                    if (flag) {
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println("Sorry");
            } else {
                System.out.println("OK");
            }
        }
    }
}
