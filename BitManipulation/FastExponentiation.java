public class FastExponentiation {

    public static int FastExponentiation(int a, int n) {
        // function for whole values of n
        int ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = a * ans;
            }
            a = a * a;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FastExponentiation(3, 5));
    }
}
