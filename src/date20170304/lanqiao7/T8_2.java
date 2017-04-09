package date20170304.lanqiao7;

import java.util.Scanner;

public class T8_2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long[] arr = new long[10000 * 100 + 1];
	long n = sc.nextLong();
	long max = n;
	for (int i = 1; i <= n; i++) {
	    long temp = i;
	    arr[i] = temp;
	    while (temp != 1) {
		if (temp % 2 == 0) {
		    temp = temp / 2;
		} else {
		    temp = temp * 3 + 1;
		}
		if (temp > arr[i]) {
		    arr[i] = temp;
		}
		if (temp < i) {
		    if (arr[(int) temp] > arr[i]) {
			arr[i] = arr[(int) temp];
		    }
		    if (arr[i] > max) {
			max = arr[i];
		    }
		    break;
		}
	    }
	}
	System.out.println(max);
    }
}
