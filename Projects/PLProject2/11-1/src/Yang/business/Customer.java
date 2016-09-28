package Yang.business;

// the public class Customer inherits the Person class
public class Customer extends Person {

    // stores customer number
    private String custNumber;

    // no-argument constructor for customer
    public Customer() {
        super();
        custNumber = "";
    }

    // method that sets the customer number
    // no return value
    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    // method that getsthe customer number
    public String getCustNumber() {
        return custNumber;
    }

    // implementation of getDisplayText
    // string returned by the toStringMethod
    public String getDisplayText() {
        return super.toString() + "Customer number: " + custNumber + "\n";
    }
}