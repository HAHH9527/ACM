package lanQiao.date20170304.lanqiao7;

public class T2 {
    public static void main(String[] args) {
	int sum = 0;
	int temp = 0;
	for (int i = 0; i <= 100; i++) {
	    temp += i;
	    sum += temp;
	}
	System.out.println(sum);
    }
}
