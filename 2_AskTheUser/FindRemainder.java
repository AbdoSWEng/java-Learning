import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the first integer
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        //read the second integer
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        // calculate quotient
        int quotient = num1 / num2;

        // calculate remainder 
        int remainder = num1 % num2;

        //diplay the results
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        
        
    }
    
}
