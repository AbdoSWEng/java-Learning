import java.util.Scanner;

public class iLoveJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a whole number
        System.out.print("Enter number between(1-10): ");
        int num = input.nextInt();

        // Check if the number is between 1 and 10 (inclusive)
        if (num <= 1 && num >= 10) {

            // Repeat the message 'number' times
            for (int i = 1; i <= num; i++) {
                // Display the message
                System.out.println("I love java");

            }
        } else {
            // Display an error message if the number is not valid
            System.out.println("Number must be between 1 and 10. ");
        }
    }
}
