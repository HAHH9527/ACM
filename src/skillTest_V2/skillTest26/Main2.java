package skillTest_V2.skillTest26;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] array = new int[n];
	for (int i = 0; i < n; i++) {
	    array[i] = sc.nextInt();
	}
	int min = array[0];
	int minflag = 0;
	for (int i = 0; i < n; i++) {
	    if (array[i] < min) {
		min = array[i];
		minflag = i;
	    }
	}
	int temp = array[minflag];
	array[minflag] = array[0];
	array[0] = temp;
	for (int i : array) {
	    System.out.print(i + " ");
	}
    }
}
