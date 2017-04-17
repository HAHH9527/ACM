package myLinkList;

public class Test {
    public static void main(String[] args) throws Exception {
	MyLinkList mll = new MyLinkList<String>();
	mll.add("0");
	mll.add("1");
	mll.add("2");
	for (int i = 0; i < mll.size; i++) {
	    System.out.println(mll.get(i));
	}
	System.out.println("---");
	System.out.println(mll.size);
	System.out.println("---");
	mll.add(1, "²åÈëµÄ");
	System.out.println(mll.end.getValue());
	System.out.println("---");
	for (int i = 0; i < mll.size; i++) {
	    System.out.println(mll.get(i));
	}
	System.out.println("---");
	System.out.println(mll.del(3));
	System.out.println("---");
	for (int i = 0; i < mll.size; i++) {
	    System.out.println(mll.get(i));
	}
	System.out.println("---");
    }
}
