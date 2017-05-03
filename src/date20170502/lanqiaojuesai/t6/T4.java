package date20170502.lanqiaojuesai.t6;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    String str = sc.next();
	    int t = sc.nextInt();
	    for (int i = 0; i < t; i++) {
		str = fun(str);
	    }
	    System.out.println(str);
	}
    }

    private static String fun(String str) {
	char[] c = str.toCharArray();
	String ret = "";
	char temp = ' ';
	int count = 0;
	for (int i = 0; i < c.length; i++) {
	    if (temp == ' ') {
		temp = c[i];
	    } else if (c[i] != temp) {
		ret = ret + String.valueOf(count) + String.valueOf(temp);
		temp = c[i];
		count = 0;
	    }
	    count++;
	}
	ret = ret + String.valueOf(count) + String.valueOf(temp);
	return ret;
    }
}
