package date20170603.HDOJ;

import java.util.Scanner;

public class Num1005 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int k = sc.nextInt();
	    if (a == 0 && b == 0) {
		continue;
	    }
	    double sum = Math.pow(10, k);
	    if (a % sum == b % sum) {
		System.out.println(-1);
		continue;
	    }
	    System.out.println(a + b);
	}
    }
}
