package myStack.RPN;

import java.util.Scanner;

import myStack.MyStack;

/**
 * @version Demo0.1
 * @author HAHH9527
 * @˼· �沨�����ʽ�����÷�����дÿ�����������������ܻ���Ҫһ��Ԫ�ش����ȼ�����ʱû�к�˼·
 */
public class ToRPN {
    private static MyStack<Character> output;// ����沨�����ʽ��ջ
    private static MyStack<Character> temp;// �洢������ŵ�ջ
    private static char[] input;// ��Ҫ������ַ�

    public static void toRPN() {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    output = new MyStack<Character>();
	    temp = new MyStack<Character>();
	    String str = sc.next();
	    input = str.toCharArray();
	    for (int i = 0; i < input.length; i++) {
		if (input[i] >= '0' && input[i] <= '9') {
		    output.push(input[i]);
		} else {
		    /*
		     * ��Щ����ȫ���÷����ж���д
		     */
		    // if (input[i] == '+' || input[i] == '-') {
		    // temp.push(input[i]);
		    // } else if (input[i] == '*' || input[i] == '/') {
		    // for (; true; i++) {
		    // if (input[i] == '+' || input[i] == '-') {
		    // while (temp.empty() == false) {
		    // output.push(temp.peek());
		    // }
		    // temp.push(input[i]);
		    // } else {
		    //
		    // }
		    // }
		    // }
		}
	    }
	}
    }

    private static void fun1() {

    }
}
