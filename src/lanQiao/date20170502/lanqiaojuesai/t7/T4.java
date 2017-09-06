package lanQiao.date20170502.lanqiaojuesai.t7;

import java.util.LinkedList;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int n = sc.nextInt();
	    LinkedList<Integer> cards = new LinkedList<Integer>();
	    int maxTickets = 0;
	    for (int i = 0; i < n; i++) {
		int temp = sc.nextInt();
		cards.add(temp);
	    }
	    for (int i = 0; i < n; i++) {
		int nowTickets = f((LinkedList<Integer>) cards.clone(), n);
		if (nowTickets > maxTickets) {
		    maxTickets = nowTickets;
		}
		int temp = cards.poll();
		cards.add(temp);
	    }
	    System.out.println(maxTickets);
	}
    }

    private static int f(LinkedList<Integer> cards, int max) {
	// while (cards.size() != 0) {
	// System.out.println(cards.poll());
	// }
	// System.out.println();
	int count = 0;
	int now = 0;
	do {
	    now++;
	    int temp = cards.poll();
	    // System.out.println(temp);
	    // System.out.println(now);
	    if (temp == now) {
		// System.out.println("true");
		count += now;
		now = 0;
	    } else {
		// System.out.println("false");
		cards.add(temp);
	    }
	    if (cards.size() == 0) {
		break;
	    }
	    // System.out.println("---");
	} while (now < max);
	// System.out.println("count:" + count);
	// System.out.println("=====");
	return count;
    }
}
