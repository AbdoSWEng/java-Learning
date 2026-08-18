import java.util.Scanner;

public class FindTheLastDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the last digit
        int lastDigit = number % 10;

        // Display the last digit
        System.out.println("The last digit is " + lastDigit);

    }
}