package Yang;


public class CustomerDB {

    //static method
    public static Customer getCustomer(int customerNumber) {
        //create Customer object
        Customer customer = new Customer();
        if (customerNumber == 1001) {
            customer.name = ("Barbara White");
            customer.address = ("3400 Richmond Parkway #3423");
            customer.city = ("Bristol");
            customer.state = ("CT");
            customer.zipcode = ("06010");

        } else if (customerNumber == 1002) {

            customer.name = ("Karl Vang");
            customer.address = ("327 Franklin Street");
            customer.city = ("Edina");
            customer.state = ("MN");
            customer.zipcode = ("55435");

        } else if (customerNumber == 1003) {

            customer.name = ("Ronda Chavan");
            customer.address = ("518 Commanche Dr.");
            customer.city = ("Greensboro");
            customer.state = ("NC");
            customer.zipcode = ("27410");
        }
        else {
            customer.name = ("");
        }
        return customer;
    }
}
