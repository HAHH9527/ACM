package hduOJ.date20170603;

import java.util.Scanner;

public class Num1007 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int n = sc.nextInt();
	    for (int i = 0; i < n; i++) {
		String password = sc.next();
		if (password.length() < 8 || password.length() > 16) {
		    System.out.println("NO");
		    continue;
		}
		boolean[] flag = new boolean[4];
		char[] temp = password.toCharArray();
		for (char c : temp) {
		    if (c >= 'A' && c <= 'Z') {
			flag[0] = true;
		    } else if (c >= 'a' && c <= 'z') {
			flag[1] = true;
		    } else if (c >= '0' && c <= '9') {
			flag[2] = true;
		    } else {
			flag[3] = true;
		    }
		}
		int count = 0;
		for (boolean b : flag) {
		    if (b) {
			count++;
		    }
		}
		if (count >= 3) {
		    System.out.println("YES");
		} else {
		    System.out.println("NO");
		}
	    }
	}
    }
}
