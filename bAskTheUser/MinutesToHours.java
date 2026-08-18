import java.util.Scanner;

public class MinutesToHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read the minutes
        System.out.print("Enter the minutes: ");
        int minutes = input.nextInt();

        // calculate hours and remaing minutes
        int hours = minutes / 60;
        int remaingMinutes = minutes % 60;

        // display the result
        System.out.println(minutes + " minutes is " + hours + " hour(s) and " + remaingMinutes + "minute(s).");

    }

}
