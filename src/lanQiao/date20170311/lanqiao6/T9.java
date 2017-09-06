package lanQiao.date20170311.lanqiao6;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    display(m, n);
	}
    }

    public static void display(int m, int n) {
	int wight = n + m - 1;
	for (int i = 0; i < n / 2; i++) {
	    for (int j = 0; j < i; j++) {
		System.out.print(".");
	    }
	    if (wight - 2 * m - 2 * i < 1) {
		for (int j = 0; j < wight - 2 * i; j++) {
		    System.out.print("*");
		}
	    } else {
		for (int j = 0; j < m; j++) {
		    System.out.print("*");
		}
		for (int j = 0; j < wight - 2 * m - 2 * i; j++) {
		    System.out.print(".");
		}
		for (int j = 0; j < m; j++) {
		    System.out.print("*");
		}
	    }
	    for (int j = 0; j < i; j++) {
		System.out.print(".");
	    }
	    System.out.println();
	}
	for (int i = 0; i < (wight - m) / 2; i++) {
	    System.out.print(".");
	}
	for (int i = 0; i < m; i++) {
	    System.out.print("*");
	}
	for (int i = 0; i < (wight - m) / 2; i++) {
	    System.out.print(".");
	}
	System.out.println();
	for (int i = n / 2 - 1; i >= 0; i--) {
	    for (int j = 0; j < i; j++) {
		System.out.print(".");
	    }
	    if (wight - 2 * m - 2 * i < 1) {
		for (int j = 0; j < wight - 2 * i; j++) {
		    System.out.print("*");
		}
	    } else {
		for (int j = 0; j < m; j++) {
		    System.out.print("*");
		}
		for (int j = 0; j < wight - 2 * m - 2 * i; j++) {
		    System.out.print(".");
		}
		for (int j = 0; j < m; j++) {
		    System.out.print("*");
		}
	    }
	    for (int j = 0; j < i; j++) {
		System.out.print(".");
	    }
	    System.out.println();
	}
    }
}
