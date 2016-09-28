package Yang;

/**
 * Created by temp on 2/6/2016.
 */


import java.util.Objects;
import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.print("\nEnter a customer number: ");
            int customerCode = sc.nextInt();
            sc.nextLine();

            Customer customer = CustomerDB.getCustomer(customerCode);

            if (customer.name.equals("")) {
                System.out.print("\nThere is no customer " + customerCode + " in our records.");
            }
            else {
                System.out.print(customer.getNameAndAddress());
            }

            System.out.println();
            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println(" Bye! ");
    }
}

