import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user
        System.out.print("Enter a nuber: ");
        int number = input.nextInt();

        
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);

        
    }
    
}
