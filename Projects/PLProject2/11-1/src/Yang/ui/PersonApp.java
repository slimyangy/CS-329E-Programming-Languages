package Yang.ui;

// import classes
import Yang.business.Person;
import Yang.business.Employee;
import Yang.business.Customer;

// create Person Application class that prompts user
public class PersonApp {

    public static void main(String args[]) {
        // introduce the application
        System.out.println("Hello, this is the Person Application.");
        System.out.println();
        // if the user inputs yes, then continue the application
        String cont = "yes";
        while (cont.equalsIgnoreCase("yes")) {
            // the user is asked if the input is a customer or an employee
            String position = Console.getString("Create customer or employee? (customer/employee): ");
            System.out.println();
            if (position.equalsIgnoreCase("customer") || position.equalsIgnoreCase("employee")) {
                String firstName = Console.getString("First name? ");
                String lastName = Console.getString("Last name? ");
                String email = Console.getString("Email? ");
                if (position.equalsIgnoreCase("customer")) {
                    String custNumber = Console.getString("Customer number: ");
                    Customer P = new Customer();
                    P.setFirstName(firstName);
                    P.setLastName(lastName);
                    P.setEmail(email);
                    P.setCustNumber(custNumber);
                    print(P);
                } else if (position.equalsIgnoreCase("employee")) {
                    String ssn = Console.getString("Social security number: ");
                    Employee e = new Employee();
                    e.setFirstName(firstName);
                    e.setLastName(lastName);
                    e.setEmail(email);
                    e.setSocialNum(ssn);
                    print(e);
                }
            } else {
                System.out.println("Not a Valid Response.");
                continue;
            }
            // ask for steps from user
            cont = Console.getString("More Inputs? (yes/no): ");
        }
    }
    private static void print(Person P) {
        System.out.println(P.getDisplayText());
    }
}