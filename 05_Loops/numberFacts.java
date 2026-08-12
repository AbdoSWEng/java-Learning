import java.util.Scanner;
public class numberFacts {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number(101 if you want stop): ");
        int number = input.nextInt();

        // Continue while the number is not 101
        while(number != 101){
            
             // Check if the number is even AND less than 50
            if(number % 2 == 0 && number < 50){
                System.out.println("Input is even and smaller then 50.");
                number = input.nextInt();
            }
             // Check if the number is odd OR greater than 70
            else if ( number % 2 != 0 || number > 70){
                System.out.println("Input is odd or greater than 70.");
            }
            // If none of the conditions above are true
            else{
                System.out.println("I do not know what this number is");
            }
            // Ask for the next number
            System.out.print("Enter an integer(101 to stop): ");
            number = input.nextInt();
           

        }



    }
    
}
