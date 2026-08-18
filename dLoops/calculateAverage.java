import java.util.Scanner;
public class calculateAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define variables
        int number;
        int counter = 0;
        int sum = 0;
        double average;

        // iniitial read outside the while loop
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextInt();

        // Continue while the number is Not zero
        while(number != 0){
            
            // count the number etered
            counter++;

            // add the number to the sum
            sum = sum + number;

            // Read the next number 
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
        }

        // calculate the average 
        average = (double)sum / counter;

        // display the reults
        System.out.println("Amount of number entered: " + counter);
        System.out.println("Sum of number: " + sum);
        System.out.println("Average: " + average);
    }
    
}
