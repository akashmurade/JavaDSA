import java.util.Scanner;

public class PracticeQuestions {
    public static void main(String[] args) {
        // Question 1: Print the sum, difference, and product of two complex numbers
        // by
        // creating a class named 'Complex' with separate methods for each operation
        // whose real and imaginary parts are entered by the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts of two complex numbers:");

        Complex a = new Complex(sc.nextInt(), sc.nextInt());
        Complex b = new Complex(sc.nextInt(), sc.nextInt());

        System.out.println("1. Sum\n2. Difference\n3. Product");
        System.out.println("Select Operation: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                Complex.sum(a, b).printNum();
                ;
                break;

            case 2:
                Complex.difference(a, b).printNum();
                break;

            case 3:
                Complex.product(a, b).printNum();
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}

class Complex {
    private int real;
    private int img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void printNum() {
        System.out.println(real + " " + (img >= 0 ? "+ " : "- ") + Math.abs(img) + "i");
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.img + b.img);
    }

    public static Complex difference(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.img - b.img);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(a.real * b.real - a.img * b.img, a.real * b.img - a.img * b.real);
    }
}