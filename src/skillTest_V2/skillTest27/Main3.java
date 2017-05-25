package skillTest_V2.skillTest27;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int count = 0;
	count += m / 100;
	m = m % 100;
	count += m / 50;
	m = m % 50;
	count += m / 10;
	m = m % 10;
	count += m / 5;
	m = m % 5;
	count += m / 2;
	m = m % 2;
	count += m;
	System.out.println(count);
    }
}
