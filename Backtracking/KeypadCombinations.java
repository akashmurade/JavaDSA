import java.util.HashMap;
import java.util.Map;

public class KeypadCombinations {

    // Keypad Combinations
    // Given a string containing digits from 2-9 inclusive, print all possible
    // letter combinations that the number could represent.
    // You can print the answer in any order.
    // A mapping of digits to letters (just like on the telephone buttons) is given
    // below.
    // Note that 1 does not map to any letters.
    // Sample Input 1: digits = "23"
    // Sample Output 1: "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
    // Sample Input 2: digits = "2"
    // Sample Output 2: "a", "b", "c"
    // Sample Input 3: digits = ""
    // Sample Output 3: ""

    private static void possibleCombinationsUtil(String digits, HashMap<Character, String> digitMapping,
            StringBuilder s, int i) {
        if (i == digits.length()) {
            System.out.print(s + " ");
            return;
        }

        char digit = digits.charAt(i);
        String charsAvailable = digitMapping.get(digit);

        for (int it = 0; it < charsAvailable.length(); it++) {
            possibleCombinationsUtil(digits, digitMapping, s.append(charsAvailable.charAt(it)), i + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public static void possibleCombinations(String digits) {
        HashMap<Character, String> digitMapping = new HashMap<>(Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"));

        possibleCombinationsUtil(digits, digitMapping, new StringBuilder(), 0);
    }

    public static void main(String[] args) {
        String digits = "23";
        possibleCombinations(digits);
    }
}
