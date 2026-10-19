/* Name : Ajay Shewale
   Roll No: 71*/
import java.util.Scanner;

class Complex_No {
    float real, img; // data members

    // Default constructor
    public Complex_No() {
        real = 0;
        img = 0;
    }

    // Parameterized constructor
    public Complex_No(float a, float b) {
        real = a;
        img = b;
    }

    // Display two complex numbers
    public void Display(Complex_No C1, Complex_No C2) {
        System.out.println("First Complex Number = (" + C1.real + ") + (" + C1.img + ")i");
        System.out.println("Second Complex Number = (" + C2.real + ") + (" + C2.img + ")i");
    }

    // Addition
    public void AddNumbers(Complex_No C1, Complex_No C2) {
        float real = C1.real + C2.real;
        float img = C1.img + C2.img;

        System.out.println("Addition = (" + real + ") + (" + img + ")i");
    }

    // Subtraction
    public void SubNumbers(Complex_No C1, Complex_No C2) {
        float real = C1.real - C2.real;
        float img = C1.img - C2.img;

        System.out.println("Subtraction = (" + real + ") + (" + img + ")i");
    }

    // Multiplication
    public void MultiNumbers(Complex_No C1, Complex_No C2) {
        float real = (C1.real * C2.real) - (C1.img * C2.img);
        float img = (C1.real * C2.img) + (C1.img * C2.real);

        System.out.println("Multiplication = (" + real + ") + (" + img + ")i");
    }

    // Division
    public void DivNumbers(Complex_No C1, Complex_No C2) {
        float denominator = (C2.real * C2.real) + (C2.img * C2.img);

        if (denominator == 0) {
            System.out.println("Division by zero is not possible.");
            return;
        }

        float real = ((C1.real * C2.real) + (C1.img * C2.img)) / denominator;
        float img = ((C1.img * C2.real) - (C1.real * C2.img)) / denominator;

        System.out.println("Division = (" + real + ") + (" + img + ")i");
    }
}

// Main class
public class ComplexNo {

    public static void main(String[] args) {

        float num1, num2;

        Complex_No cal = new Complex_No();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Complex Numbers in a + bi format:");

        // First complex number
        System.out.print("Enter real part of First Number (a): ");
        num1 = sc.nextFloat();

        System.out.print("Enter imaginary part of First Number (b): ");
        num2 = sc.nextFloat();

        Complex_No Com1 = new Complex_No(num1, num2);

        // Second complex number
        System.out.print("Enter real part of Second Number (a): ");
        num1 = sc.nextFloat();

        System.out.print("Enter imaginary part of Second Number (b): ");
        num2 = sc.nextFloat();

        Complex_No Com2 = new Complex_No(num1, num2);

        sc.close();

        System.out.println();

        // Display
        cal.Display(Com1, Com2);

        System.out.println();

        // Operations
        cal.AddNumbers(Com1, Com2);
        cal.SubNumbers(Com1, Com2);
        cal.MultiNumbers(Com1, Com2);
        cal.DivNumbers(Com1, Com2);
    }
}

