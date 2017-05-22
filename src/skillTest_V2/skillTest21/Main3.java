package skillTest_V2.skillTest21;

import java.util.Scanner;

public class Main3 {
    public static int pascalTriangle(int row, int col) {
	if (col == 1 || col == row) { // 当col为 第一列或者最后一列时返回 1
	    return 1;
	} else {
	    return pascalTriangle(row - 1, col - 1) + pascalTriangle(row - 1, col);
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	for (int i = 1; i <= x; i++) {
	    for (int i2 = 1; i2 <= i; i2++) {
		System.out.print(pascalTriangle(i, i2) + " ");
	    }
	    System.out.println();
	}
    }
}
