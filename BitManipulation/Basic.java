public class Basic {
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~5);
        // System.out.println(5 << 2); // a << b = a * 2 ^ b
        // System.out.println(6 >> 1); // a >> b = a / 2 ^ b

        // // Check if a number is even
        // int num = 10;
        // if ((num & 1) == 0) {
        // System.out.println("Even");
        // } else {
        // System.out.println("Odd");
        // }

        // // Get ith bit (i starts from 0)
        // int num = 10; // 1010
        // int i = 1;
        // boolean isSet = (num & (1 << i)) != 0;
        // System.out.println(isSet ? 1 : 0);

        // // Set ith bit (i starts from 0)
        // int num = 10; // 1010
        // int i = 2;
        // num = num | (1 << i);
        // System.out.println(num);

        // // Clear ith bit (i starts from 0)
        // int num = 10; // 1010
        // int i = 3;
        // num = num & ~(1 << i);
        // System.out.println(num);

        // // Update ith bit (i starts from 0)
        // int num = 10; // 1010
        // int i = 2;
        // int val = 1;
        // // num = val == 1 ? (1 << i | num) : (~(1 << i) & num);

        // // Another approach // clear + update
        // num = (num & ~(1 << i)) | (val << i);
        // System.out.println(num);

        // // Clear last i bits
        // int num = 10; // 1010
        // int i = 2;
        // num = (~0 << i) & num;
        // System.out.println(num);

        // // Clear range of bits from i to j (inclusive)
        // int num = 10; // 1010
        // int i = 0, j = 2; // bitmask: 11110001 // 11110000 | ~(~0 << i)
        // num = num & (~(((1 << j) - 1) << i));
        // System.out.println(num);

        // 1111 0001
        // i = 1, j = 3

        // 0000 1110

        // 0000 0001 << j
        // 0000 1000 - 1
        // 0000 0111 << i
        // 0000 1110 ~
        // 1111 0001

        // // Check if a number is power of 2 or not
        // int num = 8;
        // System.out.println((num & (num - 1)) == 0);

        // Count set bits in a number
        int num = 10;
        int cnt = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                cnt++;
            }
            num >>= 1;
        }
        System.out.println(cnt);

    }
}