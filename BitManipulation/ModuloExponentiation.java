public class ModuloExponentiation {

    public static int ModuloExponentiation(int a, int b, int p) {
        // Calculate a ^ b % p
        int result = 1;

        a = a % p; // base

        if (a == 0) { // if it is already divisible by a then the value = 0
            return 0;
        }

        while (b > 0) {

            if ((b & 1) == 1) {
                result = (result * a) % p;
            }
            a = (a * a) % p;

            b >>= 1;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(ModuloExponentiation(2, 5, 13));

    }
}
