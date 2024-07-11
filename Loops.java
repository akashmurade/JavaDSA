import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // while loop
        // Hello World 100 times
        // int i = 0;
        // while(i < 100) {
        //     System.out.println("Hello World");
        //     i++;
        // }

        // int i = 1;
        // while(i <= 10) {
        //     System.out.print(i + " ");
        //     i++;
        // }

        // sum of first n natural numbers
        // int n = 0;
        // int i = 1;
        // int sum = 0;
        // while(i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);
        // square pattern
        // for(int i = 0; i < 4; i++) {
        //     System.out.println("****");
        // }

        // Reverse a number
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int reverse = 0;
        // for(int i = num; i > 0; reverse = reverse * 10 + i % 10, i /= 10);
        // System.out.println("Reverse num: " + reverse);

        // Keep entering numbers till user enters a multiple of 10 using break
        // Scanner sc = new Scanner(System.in);
        // int input;
        // System.out.println("Enter multiple of 10 to exit the loop");
        // while(true) {
        //     System.out.print("Number: ");
        //     input = sc.nextInt();
        //     if(input % 10 == 0) {
        //         break;
        //     }
        //     System.out.println("Entered Number: " + input);
        // }
        
        // Display all numbers entered by user except multiples of 10
        // Scanner sc = new Scanner(System.in);
        // int input;
        // System.out.println("Enter -1 to exit the loop");
        // do {
        //     System.out.print("Number: ");
        //     input = sc.nextInt();
        //     if(input % 10 == 0 || input == -1) {
        //         continue;
        //     }
        //     System.out.println("Entered Number: " + input);
        // } while(input != -1);

        // Check if a number is prime or not
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // boolean isPrime = num == 1 ? false : true;
        // for(int i = 2; i <= Math.sqrt(num); i++) {
        //     if(num % i == 0) {
        //         isPrime = false;
        //         break;
        //     }
        // }
        // System.out.println(num + " is " + (isPrime ? "" : "not ") + "Prime");

        // Assignment 
        // Q2 Print the sum of even and odd integers by taking input repeatedly until user chooses to stop
        // Scanner sc = new Scanner(System.in);
        // int evenSum = 0, oddSum = 0, choice;
        // do {
        //     int num = sc.nextInt();
        //     if(num % 2 == 0) {
        //         evenSum += num;
        //     } else {
        //         oddSum += num;
        //     }
        //     choice = sc.nextInt();
        // } while(choice == 1);

        // System.out.println("Even Sum: " + evenSum);
        // System.out.println("Odd Sum: " + oddSum);

        // Factorial of a number
        // Scanner sc = new Scanner(System.in);
        // int fact = 1;
        // int num = sc.nextInt();
        // for(int i = 2; i <= num; i++) {
        //     fact *= i;
        // }
        // System.out.println("Factorial of " + num + " is " + fact);

        // Multiplication table of a number
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(num + " X " + i + " = " + num * i);
        // }
    }
}