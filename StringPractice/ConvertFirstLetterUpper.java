import java.util.Scanner;

public class ConvertFirstLetterUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder s = new StringBuilder(sc.nextLine());
        boolean firstLetter = true;

        for (int i = 0; i < s.length(); i++) {
            if (firstLetter && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                firstLetter = false;
            }
            if (s.charAt(i) == ' ') {
                firstLetter = true;
            }
        }

        System.out.println(s);
        sc.close();
    }
}
