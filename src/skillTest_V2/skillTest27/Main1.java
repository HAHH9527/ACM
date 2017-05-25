package skillTest_V2.skillTest27;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] array = new int[n];
	array[0] = 1;
	for (int i = 1; i < n; i++) {
	    int count = i - 3;
	    if (count < 0) {
		array[i] = array[i - 1] + 1;
	    } else {
		array[i] = array[i - 1] + array[count];
	    }
	}
	System.out.println(array[n - 1]);
    }
}
