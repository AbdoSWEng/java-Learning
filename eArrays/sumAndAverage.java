import java.util.Scanner;
public class sumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create an array that can store 5 integer prices
        int prices [] = new int[5];

        // first for loop 
        // read 5 prices from the kbd
        for(int i = 0; i <5; i++){
                   // i starts at 0, but we add 1 so the user sees 1, 2, 3, 4, 5.
            System.out.print("Enter price  " + (i + 1) +  " : ");
            prices[i] = input.nextInt();
        }

        // variable to store the total 
        int sum = 0;

        //second for loop 
        // add all the values in the array
        for(int i = 0; i < 5; i++){
            sum += prices[i]; // sum = sum + prices[i]
        }

        // calculate the average
        double average = (double)sum / 5;

        // display the results
        System.out.println("Sum = :" + sum);
        System.out.println("Average prices :" + average);

        }
    }
    

