import java.util.Scanner;

public class StringCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // varible to store the user String
        String text;
        // Counter to count how many Strings were entered
        int counter = 0;

        // initial input
        System.out.print("Enter a String(type Exit to stop)");
        text = input.nextLine();

        // continue while the String is not equal to exit
        while (!text.equals("Exit")) {
            // count the string entered
            counter++;

            // print the String in uppercase
            System.out.println(text.toUpperCase());

            // ask for the next string
            System.out.print("Enter a String(type Exit to stop): ");
            text = input.nextLine();
        }
        // display the number of String entered
        System.out.println("Number of Strings entered: " + counter);
        System.out.println("Thank and good bye");
    }

}
