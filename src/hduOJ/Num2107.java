package hduOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class Num2107 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int t = sc.nextInt();
	    if (t == 0) {
		break;
	    }
	    BigInteger max = new BigInteger(sc.next());
	    for (int i = 1; i < t; i++) {
		BigInteger temp = new BigInteger(sc.next());
		max = max.max(temp);
	    }
	    System.out.println(max.toString());
	}
    }
}
