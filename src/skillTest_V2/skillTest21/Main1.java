package skillTest_V2.skillTest21;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double x = sc.nextDouble();
	int y = sc.nextInt();
	double all = x * y;
	if (y >= 100) {
	    all = all * 0.8;
	} else if (y >= 10) {
	    all = all * 0.85;
	}
	System.out.println(all);
    }
}
