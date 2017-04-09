package date20170311.lanqiao6;

import java.util.Scanner;
import java.util.Vector;

public class T4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    System.out.println(f(sc.nextInt(), sc.nextInt()));
	}
    }

    public static int f(int n, int m) {
	n = n % m;
	Vector v = new Vector();
	for (;;) {
	    v.add(n);
	    n *= 10;
	    n = n % m;
	    System.out.println("**" + v.indexOf(n));
	    if (n == 0) {
		return 0;
	    }
	    if (v.indexOf(n) >= 0) {// МоїХ
		return v.size() - v.indexOf(n);
	    }
	}
    }

}
