package date20170603.HDOJ;

import java.util.Scanner;

public class Num1002 {
    private static void display(int[] x) {
	String str = ">+";
	for (int i = 0; i < x[0] - 2; i++) {
	    str += "-";
	}
	str += "+>";
	for (int i = 0; i < x[1]; i++) {
	    System.out.println(str);
	}
	System.out.println();
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int t = sc.nextInt();
	    for (int i = 0; i < t; i++) {
		int N = sc.nextInt();
		int[][] array = new int[N][2];
		for (int i2 = 0; i2 < N; i2++) {
		    array[i2][0] = sc.nextInt();
		    array[i2][1] = sc.nextInt();
		}
		for (int j = 0; j < array.length - 1; j++) {
		    for (int j2 = 0; j2 < array.length - j - 1; j2++) {
			if (array[j2][0] > array[j2 + 1][0]) {
			    int[] temp = array[j2];
			    array[j2] = array[j2 + 1];
			    array[j2 + 1] = temp;
			}
		    }
		}
		for (int[] temp : array) {
		    display(temp);
		}
	    }
	}
    }
}
