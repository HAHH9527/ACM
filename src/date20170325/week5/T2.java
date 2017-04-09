package date20170325.week5;

public class T2 {
    public static void main(String[] args) {
	double sum = 0;
	long count = 1;
	for (; sum < 15; count++) {
	    double temp = 1.0 / count;
	    sum += temp;
	}
	System.out.println(--count);
    }
}
