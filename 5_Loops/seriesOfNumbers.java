import java.util.Scanner;
public class seriesOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // stores the previous number in the series
        int previous = 0;

        // repat 50 times 
        for(int position = 1; position <= 50; position++){

            // add the position to the previous number
            int number = previous + position;

            // display the new number
            System.out.print(number + " ");

            // store the new number as the previous number
            previous = number;
        }
        
    }
    
}
