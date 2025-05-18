public class BinaryStringsProblem {

    // Print all binary strings of size N without consecutive ones
    public static void printBSWtC1s(StringBuilder s, int n) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        int len = s.length();
        printBSWtC1s(s.append(0), n - 1);
        s.deleteCharAt(len);

        if (len == 0 || s.charAt(len - 1) != '1') {
            printBSWtC1s(s.append(1), n - 1);
            s.deleteCharAt(len);
        }
    }

    public static void main(String[] args) {
        printBSWtC1s(new StringBuilder(), 10);
    }
}