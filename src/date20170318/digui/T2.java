package date20170318.digui;

import java.util.Scanner;

public class T2 {
    public static int digui(int sum, int day) {
	if (day == 1) {
	    return sum;
	}
	sum = (sum + 1) * 2;
	day--;
	return digui(sum, day);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int day = sc.nextInt();
	    int answer = digui(1, day);
	    System.out.println(answer);
	}
    }
}
