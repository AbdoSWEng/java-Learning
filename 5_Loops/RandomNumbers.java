import java.util.Scanner;
public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // roll the dice 10 time 
        for(int i = 1; i <= 10; i++){

            // generate a random number between 0 to 10
            double randomNumber = Math.random();

            // Change the random number to a value between 1 and 6
            randomNumber = randomNumber * 6 + 1;
            
            // covert the random number to integer
            int diceValue = (int) randomNumber;

            // display the dice value
            System.out.println("Dice: " + diceValue);
        }
    }
    
}
