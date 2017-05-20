import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int x = sc.nextInt();
	    int num[][] = new int[x][x];
	    for (int m = 0; m < x; m++) {
		for (int n = 0; n <= m; n++) {
		    if (n == 0 || m == n) {
			num[m][n] = 1;
		    } else {
			num[m][n] = num[m - 1][n - 1] + num[m - 1][n];
		    }
		}
	    }
	    for (int i = 0; i < x; i++) {
		for (int j = x - i; j <= x; j++) {
		    System.out.print(num[i][x - j]);
		    if (j != x) {
			System.out.print(" ");
		    }
		}
		System.out.println("");
	    }
	    System.out.println("");
	}
    }
}