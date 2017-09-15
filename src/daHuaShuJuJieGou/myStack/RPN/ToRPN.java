package daHuaShuJuJieGou.myStack.RPN;

import java.util.Scanner;

import daHuaShuJuJieGou.myStack.MyStack;

/**
 * @author HAHH9527
 * @version 1.2
 * @��־ �����ʽ���⣬������ÿ���������ߴ��ո񣬴洢ֱ��ʹ���ַ�������ɼ��㷽��
 */
public class ToRPN {
    private static MyStack<String> output = null;// ����沨�����ʽ��ջ
    private static MyStack<String> temp = null;// �洢������ŵ�ջ
    private static String[] input = null;// ��Ҫ������ַ�
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
            // display();// ��ʾ����������Ҫʹ��
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

    private static void fun0() {// Ϊ����ʱ�����
        output.push(input[i]);
    }

    private static void fun1() {// Ϊ+��-ʱ�����
        while (temp.empty() == false) {
            if (temp.empty() == false && temp.peek().equals("(")) {// ����(ʱֹͣ����
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
        if (input[i].equals("(")) {
            temp.push(input[i]);
        } else if (input[i].equals(")")) {
            while (temp.peek().equals("(") == false) {
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
