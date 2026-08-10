import java.util.Scanner;

public class ConvertKilometres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read the killometres
        System.out.print("Enter the distance in kilometres: ");
        int kelometres = input.nextInt();

        // convert to miles
        double miles = kelometres * 0.621371;

        // display the resules
        System.out.println(kelometres + " kilometres = " + miles + " miles ");

    }
}
