package skillTest_V2.skillTest25;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double t = sc.nextDouble();
	if (t >= 0 && t <= 100) {
	    if (t >= 90) {
		System.out.println("A");
	    } else if (t >= 80) {
		System.out.println("B");
	    } else if (t >= 70) {
		System.out.println("C");
	    } else if (t >= 60) {
		System.out.println("D");
	    } else {
		System.out.println("E");
	    }
	} else {
	    System.out.println("Score is error!");
	}
    }
}
