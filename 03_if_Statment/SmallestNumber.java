import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
         int num1 = input.nextInt();

        System.out.print("Enter Second number: ");
         int num2 = input.nextInt();

         if(num1 < num2){
            System.out.println("The Smallest number is: " + num1);
         }
         if (num2 < num1){
            System.out.println("The Smallest number is: " + num2);
         }
         if (num1 == num2){
            System.out.println("Both number are equal. ");
         }


    }
    
}
