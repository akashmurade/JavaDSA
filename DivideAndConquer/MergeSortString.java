public class MergeSortString {

    // returns s1 >= s2
    private static boolean stringCompare(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int min = n1 < n2 ? n1 : n2;

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return false;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return true;
            }
        }

        return n1 >= n2;
    }

    private static void merge(String[] str, int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int iterFirst = si, iterSecond = mid + 1, iterTemp = 0;

        while (iterFirst <= mid && iterSecond <= ei) {
            if (stringCompare(str[iterSecond], str[iterFirst])) {
                temp[iterTemp++] = str[iterFirst++];
            } else {
                temp[iterTemp++] = str[iterSecond++];
            }
        }

        while (iterFirst <= mid) {
            temp[iterTemp++] = str[iterFirst++];
        }

        while (iterSecond <= ei) {
            temp[iterTemp++] = str[iterSecond++];
        }

        for (int i = 0; i < ei - si + 1; i++) {
            str[si + i] = temp[i];
        }
    }

    public static void mergeSort(String[] str, int si, int ei) {
        if (si == ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(str, si, mid);
        mergeSort(str, mid + 1, ei);
        merge(str, si, mid, ei);
    }

    public static void main(String[] args) {
        String[] s = { "sun", "earth", "mars", "mercury" };
        mergeSort(s, 0, s.length - 1);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
