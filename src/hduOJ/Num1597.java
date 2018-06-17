package hduOJ;

import java.util.Scanner;

public class Num1597 {
    private static long[] len = new long[65540];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < len.length; i++) {
            len[i] = ((long) i + 1) * i / 2;
        }
//        System.out.println(len[65539]);
        while (sc.hasNext()) {
            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                long n = sc.nextLong();
                int key = BinarySearch(1, 65539, n);
//                System.out.println(key);
                long temp = n - len[key];
                long result = temp % 9;
                if (result == 0) result = 9;
                System.out.println(result);
            }
        }
    }

    private static int BinarySearch(int down, int top, long n) {
        int mid = (down + top) / 2;
//        System.out.println("down:"+down+"\tmid:"+mid+"\ttop:"+top);
        if (n > len[mid - 1] && n <= len[mid]) {
            return mid - 1;
        } else if (n > len[mid] && n <= len[mid + 1]) {
            return mid;
        } else if (n > len[mid + 1]) {
            return BinarySearch(mid + 1, top, n);
        } else {
            return BinarySearch(down, mid - 1, n);
        }
    }

}
