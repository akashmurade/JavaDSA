import java.util.Scanner;

public class PracticeQuestions {

    public static boolean isAnagram(String s1, String s2) {

        // works for lower case
        int freq[] = new int[26];

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // STRINGS QUESTIONS
        // // Question 1: Count how many times lower case vowels occurred in a String
        // // entered by the user.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter String: ");
        // String s = sc.nextLine();
        // String lowerVowels = "aeiou";
        // int cnt = 0;

        // for (int i = 0; i < s.length(); i++) {
        // if (lowerVowels.contains(String.valueOf(s.charAt(i)))) {
        // cnt++;
        // }
        // }

        // System.out.println("Count: " + cnt);

        // sc.close();

        // // Question 2 : What will be the output of the following code ?

        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // // false true

        // // Question 3 : What will be the output of the following code ?

        // String str = "ApnaCollege".replace("l", "");
        // System.out.println(str);

        // ApnaCoege

        // Question 4: Determine if 2 Strings are anagrams of each other.
        // What are anagrams? If two strings contain the same characters but in a
        // different order,
        // they can be said to be anagrams. Consider race and care. In this case, race's
        // characters
        // can be formed into care, or care's characters can be formed into race.
        // Below is a Java program to check if two strings are anagrams or not.

        String s1 = "race";
        String s2 = "care";

        System.out.println("Is Anagram: " + isAnagram(s1, s2));

    }
}
