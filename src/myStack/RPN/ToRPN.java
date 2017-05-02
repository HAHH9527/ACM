package myStack.RPN;

import java.util.Scanner;
import myStack.MyStack;

/**
 * @version 1.2
 * @author HAHH9527
 * @日志 解决格式问题，输入在每个符号两边带空格，存储直接使用字符串，完成计算方法
 */
public class ToRPN {
    private static MyStack<String> output = null;// 存放逆波兰表达式的栈
    private static MyStack<String> temp = null;// 存储计算符号的栈
    private static String[] input = null;// 需要处理的字符
    private static int i = 0;

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
	    output = new MyStack<String>();
	    temp = new MyStack<String>();
	    String str = sc.nextLine();
	    input = str.split(" ");
	    i = 0;
	    fun();
	    // display();// 显示方法，不需要使用
	    returnAnswer();
	    toNull();
	}
    }

    private static void fun() {
	for (; i < input.length; i++) {
	    if (input[i].equals("+") || input[i].equals("-")) {
		fun1();
	    } else if (input[i].equals("*") || input[i].equals("/")) {
		fun2();
	    } else if (input[i].equals("(") || input[i].equals(")")) {
		fun3();
	    } else {
		fun0();
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
	    if (temp.empty() == false && temp.peek().equals("(")) {// 碰到(时停止弹出
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
	if (input[i].equals("(")) {
	    temp.push(input[i]);
	} else if (input[i].equals(")")) {
	    while (temp.peek().equals("(") == false) {
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
    }

    private static void returnAnswer() {
	MyStack<String> temp = new MyStack<String>();
	while (output.empty() == false) {
	    temp.push(output.pop());
	}
	MyStack<String> answer = new MyStack<String>();
	while (temp.empty() == false) {
	    if (temp.peek().equals("+")) {
		temp.pop();
		String count = String.valueOf(Double.valueOf(answer.pop()) + Double.valueOf(answer.pop()));
		answer.push(count);
	    } else if (temp.peek().equals("-")) {
		temp.pop();
		String count = String.valueOf(Double.valueOf(answer.pop()) - Double.valueOf(answer.pop()));
		answer.push(count);
	    } else if (temp.peek().equals("*")) {
		temp.pop();
		String count = String.valueOf(Double.valueOf(answer.pop()) * Double.valueOf(answer.pop()));
		answer.push(count);
	    } else if (temp.peek().equals("/")) {
		temp.pop();
		String count = String.valueOf(Double.valueOf(answer.pop()) / Double.valueOf(answer.pop()));
		answer.push(count);
	    } else {
		answer.push(temp.pop());
	    }
	}
	System.out.println(answer.pop());
    }

    private static void toNull() {
	output = null;
	temp = null;
	input = null;
	i = 0;
    }
}
