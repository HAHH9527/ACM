package lanQiao.date20170311.lanqiao6;

public class T2 {
    public static void main(String[] args) {
	int count = 0;
	for (long i = 1; i <= 10000; i++) {
	    // for (int i = 1; i <= 10000; i++) {
	    long temp = i * i * i;
	    String str = String.valueOf(temp);
	    String end = String.valueOf(i);
	    if (str.endsWith(end)) {
		count++;
		System.out.println(i + " " + end + "\n" + temp + " " + str);
		System.out.println("count:" + count);
	    }
	}
    }
}
