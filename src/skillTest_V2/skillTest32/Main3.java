package skillTest_V2.skillTest32;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int ax = 0;
	    int bx = 0;
	    for (int j = 1; j < a; j++) {
		if (a % j == 0) {
		    ax += j;
		}
	    }
	    for (int j = 1; j < b; j++) {
		if (b % j == 0) {
		    bx += j;
		}
	    }
	    if (a == bx && b == ax) {
		System.out.println("YES");
	    } else {
		System.out.println("NO");
	    }
	}
    }
}
