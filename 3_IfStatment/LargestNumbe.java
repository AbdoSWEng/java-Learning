import java.util.Scanner;

public class LargestNumbe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read three numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the Second number: ");
        int num3 = input.nextInt();

        // Check if all three numbers are equal
        if (num1 == num2 && num1 == num3) {
            System.out.println("All three numbers are equal. ");
        }

        // Check if the first number is the largest
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);

        }
        // Check if the second number is the largest
        if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);

        }
        // Check if the third number is the largest
        if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);
        }

    }

}
