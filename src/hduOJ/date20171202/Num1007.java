package hduOJ.date20171202;

import java.util.Scanner;

public class Num1007 {
    private static boolean huiwen(int x) {
        boolean ret = true;
        String temp = String.valueOf(x);
        char[] c = temp.toCharArray();
        for (int i = 0; i < (c.length + 1) / 2; i++) {
            if (c[i] != c[c.length - 1 - i]) {
                ret = false;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            String out = "";
            out += x;
            int count = 0;
            while (true) {
                if (huiwen(x)) {
                    break;
                }
                char[] c = String.valueOf(x).toCharArray();
                String strTemp = "";
                for (int i = c.length - 1; i >= 0; i--) {
                    strTemp += c[i];
                }
                int intTemp = Integer.valueOf(strTemp);
                x += intTemp;
                out += "--->" + x;
                count++;
            }
            System.out.println(count);
            System.out.println(out);
        }
    }
}