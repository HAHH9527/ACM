package skillTest_V2.skillTest26;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    private static int avg(int sum, int count) {
	return sum / count;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[] array = new int[n];
	array[0] = 2;
	for (int i = 1; i < n; i++) {
	    array[i] = array[i - 1] + 2;
	}
	int sum = 0;
	int count = 0;
	int temp = 0;
	LinkedList<Integer> answer = new LinkedList<Integer>();
	for (int i = 0; i < n; i++) {
	    sum += array[i];
	    count++;
	    if (count == m) {
		temp = avg(sum, count);
		answer.add(temp);
		sum = 0;
		count = 0;
	    }
	}
	temp = avg(sum, count);
	if (temp != 0) {
	    answer.add(temp);
	}
	for (int i = 0; i < answer.size(); i++) {
	    System.out.print(answer.get(i) + " ");
	}
    }
}
