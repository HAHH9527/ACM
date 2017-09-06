package hduOJ.date20170603;

import java.util.Scanner;

public class Num1004 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int n = sc.nextInt();
	    sc.nextLine();
	    if (n == 0) {
		break;
	    }
	    int t = 0;
	    if (n % 2 == 0) {
		t = n / 2;
	    } else {
		t = n / 2 + 1;
	    }
	    char[] a = new char[t];
	    char[] b = new char[t];
	    for (int i = 0; i < t; i++) {
		a[i] = '-';
		b[i] = '-';
	    }
	    int aScore = 0;
	    int bScore = 0;
	    int count = 0;
	    for (int i = 0; i < n; i++) {
		while (true) {
		    String str = sc.nextLine();
		    if (str.endsWith(" no good")) {
			if (i % 2 == 0) {
			    a[count] = 'X';
			} else {
			    b[count] = 'X';
			    count++;
			}
			break;
		    } else {
			if (i % 2 == 0) {
			    a[count] = 'O';
			    aScore++;
			} else {
			    b[count] = 'O';
			    bScore++;
			    count++;
			}
			break;
		    }

		}
	    }
	    for (int i = 1; i <= t; i++) {
		System.out.print(i + " ");
	    }
	    System.out.println("Score");
	    for (int i = 0; i < t; i++) {
		System.out.print(a[i] + " ");
	    }
	    System.out.println(aScore);
	    for (int i = 0; i < t; i++) {
		System.out.print(b[i] + " ");
	    }
	    System.out.println(bScore);
	}
    }
}
