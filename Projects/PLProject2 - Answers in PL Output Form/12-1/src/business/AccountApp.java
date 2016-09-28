package business;

/**
 * Created by temp on 2/19/2016.
 */

import java.util.Scanner;


public class AccountApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");
        System.out.println("Checking: " + getBalanceFormatted());
        System.out.println();
        System.out.println("Enter the transactions for the month");
        System.out.println();


        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Withdrawal or deposit? (w/d): ");
            String doTransac = sc.nextLine();
            System.out.print(doTransac + "\n");


            // get the account object
            CheckingAccount a = new CheckingAccount();

            // display the output

            if (doTransac.equalsIgnoreCase("w")) {
                System.out.print("Amount: ");
                double amt = sc.nextLine();
                System.out.print(amt + "\n");
                a.withdraw(amt)
            } else if (doTransac.equalsIgnoreCase("d")){
                System.out.print("Amount: ");
                double amt = sc.nextLine();
                System.out.print(amt + "\n");
                a.withdraw(amt)
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("MonthlyFees");
        System.out.println("Checking fee:          " + getMonthlyFeeFormatted());
        System.out.println("Final Blance");
        System.out.println("Checking: " + getBalanceFormatterd());
    }
}