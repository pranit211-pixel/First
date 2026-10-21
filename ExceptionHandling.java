
import java.util.Scanner;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Arithmetic Exception");
        System.out.println("2. Number Format Exception");
        System.out.println("3. Array Index Out Of Bounds Exception");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                try 
                {
                    System.out.print("Enter Num1: ");
                    int num1 = sc.nextInt();

                    System.out.print("Enter Num2: ");
                    int num2 = sc.nextInt();

                    int result = num1 / num2;

                    System.out.println("Division = " + result);
                }
                catch (ArithmeticException e) 
                {
                    System.out.println("Arithmetic Exception: "
                            + e.getMessage());
                }
                break;

            case 2:
                try 
                {
                    System.out.print("Enter Num1: ");
                    String num1 = sc.nextLine();

                    System.out.print("Enter Num2: ");
                    String num2 = sc.nextLine();

                    int n1 = Integer.parseInt(num1);
                    int n2 = Integer.parseInt(num2);

                    System.out.println("Division = " + (n1 / n2));
                }
                catch (NumberFormatException e) 
                {
                    System.out.println("Number Format Exception: "
                            + e.getMessage());
                }
                catch (ArithmeticException e) 
                {
                    System.out.println("Arithmetic Exception: "
                            + e.getMessage());
                }
                break;

            case 3:
                try {
                    int[] arr = {10, 20, 30, 40, 50};

                    System.out.print("Enter array index: ");
                    int index = sc.nextInt();

                    System.out.println("Array element = " + arr[index]);
                }
                catch (ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println(
                        "Array Index Out Of Bounds Exception: "
                        + e.getMessage()
                    );
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
