package daHuaShuJuJieGou.date20170325.week5;

import java.math.BigInteger;
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String strN = sc.next();
	    String strM = sc.next();
	    BigInteger n = new BigInteger(strN);
	    BigInteger m = new BigInteger(strM);
	    BigInteger count = BigInteger.ONE;
	    for (BigInteger i = new BigInteger("0"); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
		BigInteger temp = i.multiply(i);
		count = count.add(temp);
	    }
	    BigInteger output = count.remainder(m);
	    System.out.println(output.toString());
	}
    }
}
