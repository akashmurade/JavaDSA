import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Conditionals add the ability to able to decide which statemetns to execute under different conditions

        // if-else statements
        // int a = 1, b = 2;
        // if(a > b) {
        //     System.out.println("largest num: " + a);
        // } else {
        //     System.out.println("largest num: " + b);
        // }
        
        // odd or even
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num % 2 == 0) {
        //     System.out.println(num + " is even");
        // } else {
        //     System.out.println(num + " is odd");
        // }
        // sc.close();

        // age check
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num >= 18) {
        //     System.out.println("Adult");
        // }
        // else if(num >= 13) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Child");
        // }
        // sc.close();

        // Income tax calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax = 0;
        // if (income > 1000000) {
        //     tax = (int)(.3 * income);
        // }
        // else if (income > 500000) {
        //     tax = (int)(.2 * income);
        // }
        // System.out.println("Tax: " + tax);
        // sc.close();

        // largest of 3 numbers
        // int a = 1, b = 2, c = 3;
        // if(a > b) {
        //     if(a > c) {
        //         System.out.println(a + " is largest");
        //     } else {
        //         System.out.println(c + " is largest");
        //     }
        // } else {
        //     if(b > c) {
        //         System.out.println(b + " is largest");
        //     } else {
        //         System.out.println(c + " is largest");
        //     }
        // }

        // Check if a student is pass or fail
        // int marks = 85;
        // System.out.println("You are " + (marks >= 35 ? "Passed" : "Failed"));

        // switch case
        // int num = 2;
        // switch(num) {
        //     case 1: 
        //         System.out.println("Eat");
        //         break;
        //     case 2: 
        //         System.out.println("Code");
        //         break;
        //     case 3: 
        //         System.out.println("Sleep");
        //         break;
        //     default: 
        //         System.out.println("Do Nothing");
        // }

        // Calculator
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Operand 1: ");
        // int a = sc.nextInt();
        // System.out.print("Operand 2: ");
        // int b = sc.nextInt();
        // System.out.print("Operator: ");
        // char ch = sc.next().charAt(0);

        // switch(ch) {
        //     case '+':
        //         System.out.println(a + b);
        //         break;
        //     case '-':
        //         System.out.println(a - b);
        //         break;
        //     case '*':
        //         System.out.println(a * b);
        //         break;
        //     case '/':
        //         System.out.println(a / b);
        //         break;
        //     case '%':
        //         System.out.println(a % b);
        //         break;
        //     default:
        //         System.out.println("invalid Input for operation to perform");
        // }

        // Assignment Questions
        // Q1 Input a num and check its polarity
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Number: ");
        // int num = sc.nextInt();
        // System.out.println((num > 0 ? "Positive" : (num == 0) ? "Neutral" : "Negative"));

        // Q2 Print whether if you have fever or not depending on whether if temperature is above 100 or not
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Temperature: ");
        // double temp = sc.nextDouble();
        // System.out.println("You" + (temp > 100 ? " " : " don't ") + "have a fever");

        // Q2 Print day of the week depending on input 1-7
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Day Number: ");
        // int dayNum = sc.nextInt();
        // switch (dayNum) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2: 
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //     default:
        //         System.out.println("Invalid Input");
        // }

        // Q5 Check leapness of a year
        // Century years need to be divisible by 400 to be leap
        // and others are divisible by 4 then they are leap
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Year: ");
        // int year = sc.nextInt();
        // // boolean isLeap = year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 ? true: false : true : false;
        // boolean isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        // System.out.println(year + " is " + (isLeap ? "" : "not ") + "a leap year");

        // for no of days in month based on month no
        // default for feb is 28
        // Scanner sc = new Scanner(System.in);
        // int monthNo = sc.nextInt();
        // System.out.println(monthNo == 2 ? 28 : monthNo <= 7 ? monthNo % 2 == 0 ? 30 : 31 : monthNo % 2 == 0 ? 31 : 30);
    }
}
