import java.util.Scanner;

public class CalculatingTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.print("Enter the first number ");
        num1 = input.nextInt();

        System.out.print("Enter the Second number ");
        num2 = input.nextInt();

        System.out.print("Enter the Third number ");
        num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        // display the
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("The sum is : " + sum);

    }

}
