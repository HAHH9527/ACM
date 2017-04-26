package myStack;

public class Test {
    public static void main(String[] args) {
	MyStack<Integer> stack = new MyStack<Integer>();
	System.out.println(stack.empty());
	for (int i = 0; i <= 4; i++) {
	    stack.push(i);
	}
	System.out.println(stack.empty());
	System.out.println(stack.search(2));
	for (int i = 0; i <= 4; i++) {
	    System.out.println(stack.peek());
	    System.out.println(stack.pop());
	}
	System.out.println(stack.empty());
    }

}
