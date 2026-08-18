import java.util.Scanner;
public class sumAndAverage {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // variable to store a total
        int sum = 0;

        // read 5 times
        for(int i = 1; i <= 5; i++){
            //ask the user 
            System.out.print("Enter an an teger:");
            int number = input.nextInt();

            // add the number to the sum
            sum = sum + number;
        }
        // calculate the average
              // Convert sum to double to get a decimal averag
       double average = (double)sum / 5;

       // display the results
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    }
    
}
