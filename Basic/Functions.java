import java.util.Scanner;

public class Functions {
    // Function Definition
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
    // Function with Parameters
    // Product Function
    public static int product(int a, int b) {
        return a*b;
    }

    // Factorial
    public static int fact(int n) {
        int fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Binomial Coefficient
    // nCr = (n!) / (r!(n-r)!)
    public static int binoCoeff(int n, int r) {
        return fact(n) / (fact(r) * fact(n-r));
    } 

    // Function Overloading
    // Multiple functions with same name but different parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // isPrime Number
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    // primesInRange Function
    public static void primesInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // binary to decimal function
    public static int binToDec(int n) {
        int dec = 0;
        // for(int power = 0; n > 0; dec += (Math.pow(2, power++) * n % 10) , n /= 10); // the below loop is same as this one but just more readable 
        for(int power = 0; n > 0; power++, n /= 10) {
            if(n % 10 == 1) {
                dec += Math.pow(2, power);
            }
        }
        return dec;
    }

    // decimal to binary function
    public static int decToBin(int n) {
        int bin = 0;
        for(int pos = 0; n > 0; n /= 2, pos++) {
            if(n % 2 == 1) {
                bin += Math.pow(10, pos);
            }
        }
        return bin;
    }

    // Q1 Avg of 3 nums
    public static float avg3(int a, int b, int c) {
        return (a+b+c)/3f;
    }

    // Q2 isEven for num
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Q3 isPalindrome for num
    public static boolean isPalindrome(int n) {
        int rev = 0;
        for(int dup = n; dup > 0; dup /= 10) {
            rev = rev*10 + dup % 10;
        }
        return rev == n;
    }

    // Q5 sumOfDigits of num
    public static int sumOfDigits(int n) {
        int sum = 0;
        for(; n > 0; sum += n % 10, n /= 10);
        return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printHelloWorld(); // Function Call

        // // function with parameters call
        // int res = add(1, 4);
        // System.out.println(res);

        // // swap-values exchange
        // int a = 5;
        // int b = 10;

        // // swap
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a: " + a);
        // System.out.println("b: " + b);

        // Product of a & b
        // int prod = product(4, 6);
        // System.out.println("Product: " + prod);

        // Factorial
        // int n = sc.nextInt();
        // System.out.println("Factorial of " + n + " is " + fact(n));

        // Binomial Coefficient
        // int n = sc.nextInt(), r = sc.nextInt();
        // System.out.println(n + "C" + r + ": " + binoCoeff(n, r));

        // Function Overloading
        // System.out.println(sum(1, 2));
        // System.out.println(sum(1, 2, 3));
        // System.out.println(sum(1.2f, 1.8f)); // f is required for it to be a float
        
        // isPrime function
        // int n = sc.nextInt();
        // System.out.println(n + " is Prime: " + isPrime(n));

        // primesInRange function
        // int n = sc.nextInt();
        // primesInRange(n);

        // convert number from binary to decimal
        // int n = sc.nextInt();
        // System.out.println(binToDec(n));

        // convert number from decimal to binary
        // int n = sc.nextInt();
        // System.out.println(decToBin(n));

        // Assignment
        // Q1 Function to compute average of 3 nums
        // int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // System.out.println(avg3(a, b, c));

        // Q2 isEven Function
        // int n = sc.nextInt();
        // System.out.println(isEven(n));

        // Q3 isPalindrome Function // a num is a palindrome if its reverse num is the same as the num
        // int n = sc.nextInt();
        // System.out.println(isPalindrome(n));

        // Q4 Learn methods related to Math class
        // System.out.println(Math.min(2,3));
        // System.out.println(Math.max(2, 3));
        // System.out.println(Math.sqrt(3));
        // System.out.println(Math.pow(2, 2));
        // System.out.println(Math.abs(-1));

        // Q5 Sum of digits of an integer
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}   
