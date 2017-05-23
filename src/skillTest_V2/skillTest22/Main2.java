package skillTest_V2.skillTest22;

public class Main2 {
    public static void main(String[] args) {
	double x = 0;
	boolean flag = true;
	for (double i = 1; i <= 99; i += 2) {
	    double temp = 1 / i;
	    if (flag) {
		x += temp;
		flag = false;
	    } else {
		x -= temp;
		flag = true;
	    }
	}
	System.out.println("pi=" + (4.0 * x));
    }
}
