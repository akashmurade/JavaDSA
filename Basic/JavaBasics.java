import java.util.Scanner;
public class JavaBasics 
{
    public static void main(String []args) 
    {
        // System.out.println("Hello World"); // ; here is a statement terminator

        // Pattern
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.
        // int a = 10;

        // DataTypes
        // Primitive
        // byte b = 10; // 1 byte
        // System.out.println(b);
        // char ch = 'a'; // 2 bytes
        // System.out.println(ch);
        // boolean bo = true; // 1 bit
        // System.out.println(bo);
        // int num = 1000; // 4 bytes
        // System.out.println(num);
        // short s = 1111; // 2 bytes
        // System.out.println(s);
        // long l = 1111111; // 8 bytes
        // System.out.println(l);
        // float f = 1.5f; // 4 bytes
        // System.out.println(f);
        // double d = 1.5; // 8 bytes
        // System.out.println(d);

        // Non-Primitive
        // String, Array, etc

        // Sum of two numbers
        // int num1 = 1;
        // int num2 = 2;
        // int sum = num1 + num2;
        // System.out.println(sum);

        // Single Line Comment
        /*
            MultiLine Comment
        */

        // Input in Java
        // next
        // nextLine
        // nextInt
        // nextByte
        // nextShort
        // nextFloat
        // nextDouble
        // nextBoolean
        // nextShort
        // nextLong

        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // System.out.println(str);
        
        // int i = sc.nextInt();
        // System.out.println(i);
        // sc.nextLine(); // sc.nextInt() when works it asks for a input and the input given is a number followed by newline
        // so inorder to consume that newline we use here a sc.nextLine() and then again ask for input to save in the name
        // if complicated search youtube for sc.nextLine() after sc.nextInt()
        // String name = sc.nextLine();
        // System.out.println(name);

        // float fl = sc.nextFloat();
        // System.out.println(fl);  
        
        // boolean b = sc.nextBoolean();
        // System.out.println(b);

        // byte by = sc.nextByte();
        // System.out.println(by);

        // Sum of two numbers through input from user
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b; // for product just add * instead of + and ethically product instead of sum
        // System.out.println(sum);

        // Area of a circle
        // Scanner sc = new Scanner(System.in);
        // float radius = sc.nextFloat();
        // float area = 22f * radius * radius / 7;
        // System.out.println(area);

    }
}
// boilerplate code