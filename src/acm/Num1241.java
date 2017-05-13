package acm;

import java.util.Scanner;

public class Num1241 {
    private static void thisOilDeposits(char[][] deposits, int i, int i2) {
	if (i2 < 0 || i2 >= deposits[0].length || i < 0 || i >= deposits.length) {
	    return;
	}
	if (deposits[i][i2] == '@') {
	    deposits[i][i2] = '*';
	    thisOilDeposits(deposits, i - 1, i2 - 1);
	    thisOilDeposits(deposits, i - 1, i2);
	    thisOilDeposits(deposits, i - 1, i2 + 1);
	    thisOilDeposits(deposits, i, i2 + 1);
	    thisOilDeposits(deposits, i + 1, i2 + 1);
	    thisOilDeposits(deposits, i + 1, i2);
	    thisOilDeposits(deposits, i + 1, i2 - 1);
	    thisOilDeposits(deposits, i, i2 - 1);
	}
    }

    private static int countOilDeposits(char[][] deposits) {
	int count = 0;
	for (int i = 0; i < deposits.length; i++) {
	    for (int i2 = 0; i2 < deposits[i].length; i2++) {
		if (deposits[i][i2] == '@') {
		    count++;
		    thisOilDeposits(deposits, i, i2);
		}
	    }
	}
	return count;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    if (m == 0) {
		continue;
	    }
	    char[][] deposits = new char[m][n];
	    for (int i = 0; i < m; i++) {
		String tempStr = sc.next();
		char[] tempChar = tempStr.toCharArray();
		deposits[i] = tempChar;
	    }
	    int count = countOilDeposits(deposits);
	    System.out.println(count);
	}
    }
}
