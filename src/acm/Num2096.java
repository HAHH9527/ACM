package acm;

import java.util.Scanner;

public class Num2096 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int t = sc.nextInt();
	    for (int i = 0; i < t; i++) {
		int a = sc.nextInt() % 100;
		int b = sc.nextInt() % 100;
		System.out.println((a + b) % 100);
	    }
	}
    }
}
