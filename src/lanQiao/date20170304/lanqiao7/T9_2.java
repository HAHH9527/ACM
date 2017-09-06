package lanQiao.date20170304.lanqiao7;

import java.util.Scanner;

public class T9_2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int max = (int) Math.sqrt(n);
	for (int a = 0; a <= max; a++) {
	    for (int b = a; b <= max; b++) {
		for (int c = b; c <= max; c++) {
		    // ÓÅ»¯
		    int d = (int) Math.sqrt(n - (a * a + b * b + c * c));
		    if (a * a + b * b + c * c + d * d == n) {
			System.out.println(a + " " + b + " " + c + " " + d);
			System.exit(0);
		    }
		    // for (int d = c; d <= max; d++) {
		    // if (a * a + b * b + c * c + d * d == n) {
		    // System.out.println(a + " " + b + " " + c + " " + d);
		    // System.exit(0);
		    // } else if (a * a + b * b + c * c + d * d > n) {
		    // continue;
		    // }
		}
	    }
	}
    }
}
