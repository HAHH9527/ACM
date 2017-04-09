package date20170304.lanqiao7;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] answer = new int[4];
	for (int i = 0; i < answer.length; i++) {
	    answer[i] = (int) Math.sqrt(n);
	    n -= answer[i] * answer[i];
	    if (n == 0) {
		break;
	    }
	}
	System.out.println(answer[3] + " " + answer[2] + " " + answer[1] + " " + answer[0]);
    }
}