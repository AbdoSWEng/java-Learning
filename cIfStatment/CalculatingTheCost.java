import java.util.Scanner;
public class CalculatingTheCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wight (kg): ");
        int wight = input.nextInt();

        // variables the parcel weight
        double cost = 0;

        //less then 2 kg
        if (wight < 2){
            cost = wight * 10;
        }
        // 2 kg to 4 kg
        if ( wight >= 2){
            cost = wight * 20;
        }

        if (wight >= 4){
            cost = wight * 30;
        }
        if (wight >= 6){
            cost = wight * 50;
        }
        //display the total cost 
        System.out.println("It will cost R " + cost + " to deliver your parcel. ");
    }
    
}
