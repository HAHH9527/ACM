package lanQiao.date20170502.lanqiaojuesai.t6;

import java.math.BigInteger;

public class T2 {
    public static void main(String[] args) {
        for (int i = 190; i <= 200; i++) {
            if (HW(i) == 31) {
                System.out.println(i);
            }
        }
        // HW(196);
    }

    private static int HW(int i) {
        BigInteger bigInt = new BigInteger(String.valueOf(i));
        int count = 0;
        while (count <= 30) {
            String str = bigInt.toString();
            char[] ch = str.toCharArray();
            String str2 = "";
            for (char c : ch) {
                str2 = c + str2;
            }
            if (str.equals(str2)) {
                break;
            }
            BigInteger temp = new BigInteger(str2);
            bigInt = bigInt.add(temp);
            count++;
            // System.out.println(count);
        }
        return count;
    }
}
