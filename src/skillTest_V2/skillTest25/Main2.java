package skillTest_V2.skillTest25;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n = sc.nextDouble();
	int m = sc.nextInt();
	double sum = 0;
	for (int i = 0; i < m; i++) {
	    sum += n;
	    n = Math.sqrt(n);
	}
	System.out.println(sum);
    }
}
