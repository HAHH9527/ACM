package date20170502.lanqiaojuesai.t7;

import java.util.LinkedList;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int n = sc.nextInt();
	    LinkedList<Integer> cards = new LinkedList<Integer>();
	    int maxTicket = 0;
	    for (int i = 0; i < n; i++) {
		int temp = sc.nextInt();
		cards.add(temp);
	    }
	    for (int i = 0; i <= n; i++) {
		int temp = cards.poll();
		cards.add(temp);
		int nowTicket = f(cards);
		if (nowTicket > maxTicket) {
		    maxTicket = nowTicket;
		}
	    }
	    System.out.println(maxTicket);
	}
    }

    private static int f(LinkedList<Integer> cards) {

	return 0;
    }
}
