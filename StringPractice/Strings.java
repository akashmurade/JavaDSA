import java.util.Scanner;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // In Java, a String is an object representing a sequence of characters.
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("abcd");

        // Strings are IMMUTABLE

        // Input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String sentence = sc.nextLine();
        // System.out.println(name);
        // System.out.println(sentence);

        // length() // it is a function here in case of string and a property for a
        // array
        // char arr[] = {'a', 'b', 'c', 'd'};
        // System.out.println(arr.length);
        // String str = "abcd";
        // System.out.println(str.length());

        // printing characters individually
        String str = "abcd";
        printLetters(str);
    }
}