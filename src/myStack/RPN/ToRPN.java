package myStack.RPN;

import java.util.Scanner;
import myStack.MyStack;

/**
 * @version 1.1
 * @author HAHH9527
 * @��־ Ϊ�˽����λ�����ڼ�⵽���ź�����һ���ո�
 */
public class ToRPN {
    private static MyStack<Character> output;// ����沨�����ʽ��ջ
    private static MyStack<Character> temp;// �洢������ŵ�ջ
    private static char[] input;// ��Ҫ������ַ�
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

    private static void fun0() {// Ϊ����ʱ�����
	output.push(input[i]);
    }

    private static void fun1() {// Ϊ+��-ʱ�����
	while (temp.empty() == false) {
	    if (temp.empty() == false && temp.peek() == '(') {// ����(ʱֹͣ����
		break;
	    }
	    output.push(temp.pop());
	}
	temp.push(input[i]);
    }

    private static void fun2() {// Ϊ*��/ʱ�����
	temp.push(input[i]);
    }

    private static void fun3() {// Ϊ(��)ʱ�����
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

    private static void display() {// ����沨�����ʽ
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
