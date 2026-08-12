import java.util.Scanner;
public class testOfCharaters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        // Variable to store the character entered
        char chara;

        // Counter for characters smaller than P
        int counter = 0;

        System.out.print("Enter a character (@ to stop): ");
        chara = input.next().charAt(0);


        // Continue while the character is not @
        while(chara !=  '@'){

            // Check if the character is smaller than P
            if(chara < 'P'){

                 // Count the character
                counter++;
            }
            // Read the next character
            System.out.print("Enter a character (@ to stop): ");
            chara = input.next().charAt(0);

        }
        System.out.println("Number of characters smaller than P: " + counter);

    }
    
}
