import java.util.Scanner;
public class shopApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Array containing the names of the items
        String [] items ={ "Bread", "Milk", "Butter", "Chips","Honey", "Soap", "Towel", "Carrots", "Beans", "Samp", "Dress", "Pants", "Shoes", "Socks"};

         // Array containing the prices of the items
        // The two arrays work in parallel
        double [] prices = {5.50, 12.00, 56.00, 20.00, 45.00,7.00, 75.00, 8.00, 5.00, 12.00, 200.00, 150.00, 400.00, 25.00};

        // Display every item and its price
        System.out.print("Items in stock with prices ");
        System.out.print("--------------------------- ");
        
        for(int i = 0; i < items.length; i++){
             System.out.println(items[i] + "- R" + prices[i]);
        }
         // Calculate the average price
        double total = 0;

        for(int i = 0; i < items.length; i++){
            total += prices[i];
        }

        double average = total / prices.length;

        System.out.println();
        System.out.println("The average price of all the items is R" + average);

        // Search for a specific item
        System.out.println();
        System.out.println("Item Look up");
        System.out.println("What item are you looking for? ");
        String searchItem = input.nextLine();

         // Assume the item has not been found
         boolean found = false;

         // Search through the items array
         for(int i = 0; i < items.length; i++){
             // Check if the current item matches
            // the item entered by the user
            if(items[i].equalsIgnoreCase(searchItem)){

                // The item was found
                found = true;

                // Because the arrays are parallel,
                // prices[i] is the price of items[i].
                System.out.println("The price of item " + items[i]);

            }

         }
         // If the item was not found
         if(!found){
            System.out.println("Item " + searchItem + "is not stocked in the shop");
         }

    }
}
