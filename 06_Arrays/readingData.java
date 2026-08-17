import java.util.Scanner;

public class readingData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create an array that can store 5 integer marks
        int marks[] = new int[5];

        // Read marks from the keyboard
        for (int i = 0; i < marks.length; i++) {
            // i + 1 is used because users count from 1,
            // while array indexes start from 0.
            System.out.print("Enter your marks " + (i + 1) + ": ");
            // Store the entered mark in the array
            marks[i] = input.nextInt();
        }
        // Display all the marks entered
        System.out.print("\nMarks entered: ");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // Variable to store the total
        int total = 0;

        // Calculate the total of all marks
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

        }
        // Calculate the average
        double average = (double) total / marks.length;
        
    // display the results    
    System.out.println("Total:" + total);
    System.out.println("Average:" + average);

    }

}
