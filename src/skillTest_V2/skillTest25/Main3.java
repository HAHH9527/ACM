package skillTest_V2.skillTest25;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double sum = 0;
	for (int i = 1; i <= n; i++) {
	    double temp = 1.0 / i;
	    if (i % 2 != 0) {
		sum += temp;
	    } else {
		sum -= temp;
	    }
	}
	System.out.printf("%.2f", sum);
    }
}
