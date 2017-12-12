public class Main {

    public static void main(String[] args) {
        String str = "abc abc aacc ccdd";
        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}