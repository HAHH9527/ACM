package daHuaShuJuJieGou.date20170422.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            ThisLinkList<Character> output = new ThisLinkList<Character>();
            String input = sc.nextLine();
            char[] ch = input.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '[') {
                    output.toHome();
                } else if (ch[i] == ']') {
                    output.toEnd();
                } else {
                    output.add(ch[i]);
                }
            }
            display(output);
        }
    }

    public static void display(ThisLinkList<Character> output) {
        output.current = output.head;
        while (output.current.getNext().getValue() != null) {
            output.current = output.current.getNext();
            System.out.print(output.current.getValue());
        }
        System.out.println();
    }
}
