public class StringBasic {
    public static void main(String[] args) {
        // String s1 = "some";
        // String s2 = "some";
        // String s3 = new String("some");
        // String s4 = new String("some");
        // System.out.println("equal: " + (s3 == s4)); // here the parenthesis is
        // important // since + operates first

        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);

    }
}
