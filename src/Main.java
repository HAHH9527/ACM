import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	BigInteger x = new BigInteger("2");
	int count = 1;
	while (true) {
	    x = x.multiply(x);
	    count++;
	    System.out.println(count + ":\n" + x.toString());
	}
    }
}
