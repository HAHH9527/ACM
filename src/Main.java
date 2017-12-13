public class Main {

    public static void main(String[] args) {
        String str = "a             aaa bb       c bd      ";
        String[] arr = str.split(" ");
        for (String s : arr) {
            System.out.println("\"" + s + "\"");
        }
    }
}