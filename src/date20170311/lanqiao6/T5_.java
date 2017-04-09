package date20170311.lanqiao6;

import java.util.Scanner;

public class T5_ {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int width = sc.nextInt();
	int height = sc.nextInt();
	String s = sc.next();
	stringInGrid(width, height, s);
    }

    public static void stringInGrid(int width, int height, String s) {
	if (s.length() > width - 2)
	    s = s.substring(0, width - 2);
	System.out.print("+");
	for (int i = 0; i < width - 2; i++)
	    System.out.print("-");
	System.out.println("+");

	for (int k = 1; k < (height - 1) / 2; k++) {
	    System.out.print("|");
	    for (int i = 0; i < width - 2; i++)
		System.out.print(" ");
	    System.out.println("|");
	}

	System.out.print("|");

	String ff = "____________________________"; // МоїХ
	System.out.print(String.format(ff, "", s, ""));
	System.out.println("|");
	for (int k = (height - 1) / 2 + 1; k < height - 1; k++) {
	    System.out.print("|");
	    for (int i = 0; i < width - 2; i++)
		System.out.print(" ");
	    System.out.println("|");
	}

	System.out.print("+");
	for (int i = 0; i < width - 2; i++)
	    System.out.print("-");
	System.out.println("+");
    }
}
