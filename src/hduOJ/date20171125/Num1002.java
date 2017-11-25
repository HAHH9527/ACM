package hduOJ.date20171125;

import java.util.Scanner;

public class Num1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String str = "~!@#$%^";
        while (sc.hasNext()) {
            int M = sc.nextInt();
            for (int i = 0; i < M; i++) {
                boolean[] flag = new boolean[4];
                String passStr = sc.next();
                char[] passChar = passStr.toCharArray();
                if (passChar.length >= 8 && passChar.length <= 16) {
                    for (int i1 = 0; i1 < passChar.length; i1++) {
                        char temp = passChar[i1];
                        if (temp >= 65 && temp <= 90) {
                            flag[0] = true;
                        } else if (temp >= 97 && temp <= 122) {
                            flag[1] = true;
                        } else if (temp >= 48 && temp <= 57) {
                            flag[2] = true;
                        } else if (str.indexOf(temp) >= 0) {
                            flag[3] = true;
                        }
                    }
                }
                int count = 0;
                for (boolean b : flag) {
                    if (b) {
                        count++;
                    }
                }
                if (count >= 3) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
