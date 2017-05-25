package skillTest_V2.skillTest28;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double[] array = new double[3];
	for (int i = 0; i < 3; i++) {
	    array[i] = sc.nextDouble();
	}
	for (int i = 0; i < array.length - 1; i++) {
	    for (int i2 = 0; i2 < array.length - 1 - i; i2++) {
		if (array[i2] < array[i2 + 1]) {
		    double temp = array[i2];
		    array[i2] = array[i2 + i];
		    array[i2 + 1] = temp;
		}
	    }
	}
	if (array[0] + array[1] < array[2] && array[2] - array[1] > array[0]) {
	    System.out.println("YES");
	} else {
	    System.out.println("NO");
	}
    }
}
