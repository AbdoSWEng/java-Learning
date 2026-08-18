import java.util.Scanner;

public class DisplayTheSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the numbers
        System.out.print("Pleas enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        // Check if the first number is smaller
        if (num1 < num2) {
            // Calculate the square of the first number
            int square = num1 * num1;
            // Display the smallest number
            System.out.println("The smallest number is: " + num1);

            // Display the square of the smallest number
            System.out.println("The Square of " + num1 + " is " + square);
        }
        // Check if the second number is smaller
        if (num2 < num1) {

            // Calculate the square of the second number
            int square = num2 * num2;

            // Display the smallest number
            System.out.println("The smallest number is: " + num2);

            // Display the square of the smallest number
            System.out.println("The square of " + num2 + " is " + square);
        }
        // Check if both numbers are equal
        if (num1 == num2) {

            // Calculate the square of either number
            int square = num1 * num2;

            // Display a message that both numbers are equal
            System.out.println("Both numbers are equal: " + num1);

            // Display the square
            System.out.println("The square of " + num1 + " is " + square);
        }
    }

}
