package daHuaShuJuJieGou.date20170325.week5;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int n = sc.nextInt();
	int sum = x;
	for (int i = 0; i < n; i++) {
	    String str = String.valueOf(sum);
	    sum = 0;
	    char[] c = str.toCharArray();
	    int[] temp = new int[c.length];
	    for (int j = 0; j < c.length; j++) {
		temp[j] = c[j] - 48;
		sum += temp[j] * temp[j];
	    }
	}
	System.out.println(sum);
    }
}
