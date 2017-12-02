package hduOJ.date20171202;

import java.util.Scanner;

public class Num1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ipStr = sc.nextLine();
            if (f(ipStr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean f(String ipStr) {
        String[] ipSplit = ipStr.split("\\.");
        char[] ipCharArr = ipStr.toCharArray();
        int count = 0;
        for (String temp : ipSplit) {
            try {
                int tempInt = Integer.valueOf(temp);
                if (tempInt < 0 || tempInt > 255) {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        if (ipSplit.length != 4) {
            return false;
        }
        for (char temp : ipCharArr) {
            if (temp == '.' || (temp >= '0' && temp <= '9')) {
                if (temp == '.') {
                    count++;
                }
            } else {
                return false;
            }
        }
        if (count != 3) {
            return false;
        }
        return true;
    }
}
