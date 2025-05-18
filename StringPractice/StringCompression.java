public class StringCompression {
    public static void main(String[] args) {

        String s = "abcd";
        if (s.length() > 0) {
            char curr = s.charAt(0);
            int cnt = 1;

            StringBuilder compressedString = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != curr) {
                    compressedString.append(curr + (cnt > 1 ? String.valueOf(cnt) : ""));
                    curr = s.charAt(i);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            compressedString.append(curr + (cnt > 1 ? String.valueOf(cnt) : ""));
            System.out.println("Compressed String: " + compressedString);
        }
    }
}
