package myStack.RPN;

import java.util.Scanner;

import myStack.MyStack;

/**
 * @version Demo0.1
 * @author HAHH9527
 * @思路 逆波兰表达式，利用方法来写每个运算符的情况，可能还需要一个元素存优先级，暂时没有好思路
 */
public class ToRPN {
    private static MyStack<Character> output;// 存放逆波兰表达式的栈
    private static MyStack<Character> temp;// 存储计算符号的栈
    private static char[] input;// 需要处理的字符

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
		     * 这些内容全部用方法判断重写
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
