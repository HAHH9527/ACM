package date20170311.lanqiao6;

public class T7 {
    public static void main(String[] args) {
	int sum = 0;
	for (int i = 1; i <= 49; i++) {
	    sum += i;
	}
	System.out.println("sum:" + sum);
	for (int i = 1; i < 49; i++) {
	    int temp = sum - i - (i + 1);
	    int sum2 = temp + (i * (i + 1));
	    for (int j = i; j < 49; j++) {
		int temp2 = sum2 - j - (j + 1);
		int sum3 = temp2 + (j * (j + 1));
		if (2015 == sum3) {
		    System.out.println(i + " " + j);
		}
	    }
	}
    }
}
