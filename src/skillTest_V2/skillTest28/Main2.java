package skillTest_V2.skillTest28;

import java.util.Scanner;

public class Main2 {
    public static int maxCommonDivisor(int m, int n) {

	if (m < n) {
	    int temp = m;
	    m = n;
	    n = temp;
	}
	while (m % n != 0) {
	    int temp = m % n;
	    m = n;
	    n = temp;
	}
	return n;
    }

    public static int minCommonMultiple(int m, int n) {
	return m * n / maxCommonDivisor(m, n);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	System.out.println(minCommonMultiple(m, n));
    }
}
