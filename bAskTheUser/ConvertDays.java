import java.util.Scanner;
public class ConvertDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of days
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();

        // calculate years
        int years = days / 365;

        // remaining days after years
        int remainingDays = days % 365;

        // remaining days afert weeks
        int weeks = remainingDays % 7;

        // remaining days after weeks
        int daysLeft = remainingDays % 7;

        // Display the result
        System.out.println(days + "days = " + years + "years(s), " + weeks + "week(s), and " + daysLeft + " day(s)");

    }
    
}
