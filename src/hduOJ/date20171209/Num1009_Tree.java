package hduOJ.date20171209;

import java.util.Scanner;

//用字典树的方法
public class Num1009_Tree {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Trie root = new Trie();
        String str;
        boolean flag = true;
        while (flag) {
            str = sc.nextLine();
            if ("".equals(str)) {
                flag = false;
            }
            insert(root, str);
        }
        while (sc.hasNext()) {
            str = sc.nextLine();
            System.out.println(search(root, str));
        }
    }

    private static void insert(final Trie root, String str) {
        Trie cur = root;
        int idx;
        for (int i = 0; i < str.length(); i++) {
            idx = str.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                cur.child[idx] = new Trie();
            }
            cur = cur.child[idx];
            cur.ch = str.charAt(i);
            cur.cnt = cur.cnt + 1;
        }
    }

    private static int search(final Trie root, String str) {
        int cnt = 0;
        Trie cur = root;
        int idx;
        for (int i = 0; i < str.length(); i++) {
            idx = str.charAt(i) - 'a';
            if (cur.child[idx] == null) {
                return 0;
            }
            cur = cur.child[idx];
            cnt = cur.cnt;
        }
        return cnt;
    }
}

class Trie {
    char ch;
    int cnt;
    Trie[] child;

    public Trie() {
        cnt = 0;
        child = new Trie[26];
    }
}
