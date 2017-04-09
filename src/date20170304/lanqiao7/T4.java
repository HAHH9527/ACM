package date20170304.lanqiao7;

public class T4 {
    public static int gcd(int a, int b) {
	if (b == 0)
	    return a;
	return gcd(b, a % b);
    }

    public static void main(String[] args) {
	int n = 0;
	for (int i = 0; i < 6; i++) {
	    for (int j = 0; j < 6; j++) {
		for (int k = 0; k < 6; k++) {
		    if (i + j + 2 == k + 1 || i + k + 2 == j + 1 || k + j + 2 == i + 1)
			n++; // Ìî¿ÕÎ»ÖÃ
		}
	    }
	}
	System.out.println(n);
	int m = gcd(n, 6 * 6 * 6);
	System.out.println(n / m + "/" + 6 * 6 * 6 / m);
    }
}
