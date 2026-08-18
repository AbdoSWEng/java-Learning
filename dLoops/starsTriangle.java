import java.util.Scanner;
public class starsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask the user for the number of lines
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Outer loop controls the number of lines
        for(int i = 1; i <= num; i++ ){

            // inner loop prints the stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // move to the next line
            System.out.println();
        }

    }
    
}
