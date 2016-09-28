package Yang.ui;

/**
 * Created by temp on 2/17/2016.
 */

import Yang.business.CheckingAccount;
import Yang.business.Transactions;
import java.util.Scanner;
import Yang.ui.Console;

public class AccountApp {

    public AccountApp() {}

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");
        CheckingAccount account = new CheckingAccount(1.0D);
        account.setBalance(1000.0D);
        System.out.println("Checking: " + account.getBalanceFormatted());
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

            // display the output

            if (doTransac.equalsIgnoreCase("w")) {
                System.out.print("Amount: ");
                String amt = sc.nextLine();
                double amount = (Double.valueOf(amt)).doubleValue();
                System.out.print(amt + "\n");
                Transactions.withdraw(account, amount);
            } else if (doTransac.equalsIgnoreCase("d")){
                System.out.print("Amount: ");
                String amt = sc.nextLine();
                double amount = (Double.valueOf(amt)).doubleValue();
                System.out.print(amt + "\n");
                Transactions.deposit(account, amount);
            }

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }

        account.subtractMonthlyFee();
        System.out.println("MonthlyFees");
        System.out.println("Checking fee:          " + account.getMonthlyFeeFormatted());
        System.out.println("Final Balance");
        System.out.println("Checking: " + account.getBalanceFormatted());
    }
}