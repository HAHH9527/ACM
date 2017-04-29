package myStack.RPN;

import java.util.Scanner;
import myStack.MyStack;

/**
 * @version 1.1
 * @author HAHH9527
 * @日志 为了解决多位数，在检测到符号后会插入一个空格
 */
public class ToRPN {
    private static MyStack<Character> output;// 存放逆波兰表达式的栈
    private static MyStack<Character> temp;// 存储计算符号的栈
    private static char[] input;// 需要处理的字符
    private static int i;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    output = new MyStack<Character>();
	    temp = new MyStack<Character>();
	    String str = sc.next();
	    input = str.toCharArray();
	    i = 0;
	    fun();
	    display();
	}
    }

    private static void fun() {
	for (; i < input.length; i++) {
	    if (input[i] >= '0' && input[i] <= '9') {
		fun0();
	    } else if (input[i] == '(' || input[i] == ')') {
		fun3();
	    } else {
		output.push(' ');
		if (input[i] == '+' || input[i] == '-') {
		    fun1();
		} else if (input[i] == '*' || input[i] == '/') {
		    fun2();
		}
	    }
	}
	while (temp.empty() == false) {
	    output.push(temp.pop());
	}
    }

    private static void fun0() {// 为数字时的情况
	output.push(input[i]);
    }

    private static void fun1() {// 为+或-时的情况
	while (temp.empty() == false) {
	    if (temp.empty() == false && temp.peek() == '(') {// 碰到(时停止弹出
		break;
	    }
	    output.push(temp.pop());
	}
	temp.push(input[i]);
    }

    private static void fun2() {// 为*或/时的情况
	temp.push(input[i]);
    }

    private static void fun3() {// 为(或)时的情况
	if (input[i] == '(') {
	    temp.push(input[i]);
	} else if (input[i] == ')') {
	    while (true) {
		if (temp.peek() == '(') {
		    break;
		}
		output.push(temp.pop());
	    }
	    temp.pop();
	}
    }

    private static void display() {// 输出逆波兰表达式
	String str = "";
	while (output.empty() == false) {
	    str = output.pop() + str;
	}
	System.out.println(str);
	output = null;
	temp = null;
	input = null;
	i = 0;
    }
}
