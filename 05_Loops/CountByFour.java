import java.util.Scanner;

public class CountByFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 4; i <= 200; i += 4) {
            System.out.print(i + " ");

            // after every multiple of 40, start a new line
            if (i % 40 == 0) {
                System.out.println();
            }

        }
    }

}
