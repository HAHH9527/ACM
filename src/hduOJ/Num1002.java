package hduOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class Num1002 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt();
	for (int i = 1; i <= l; i++) {
	    if (i != 1)
		System.out.println();
	    BigInteger a, b;
	    a = sc.nextBigInteger();
	    b = sc.nextBigInteger();
	    System.out.println("Case " + i + ":");
	    System.out.println(a + " + " + b + " = " + a.add(b));
	}
    }
}
