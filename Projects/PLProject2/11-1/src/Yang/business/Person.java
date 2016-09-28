package Yang.business;

// create an abstract person class
// abstract classes can't be instantiated
// only purpose is for other classes to extend it
// if you have common code to use in sub classes but the abstract class should not have instances of its own
public abstract class Person {

    // store first name, last name, and email address
    // private means that these variables can only be accessed by this class
    private String firstName;
    private String lastName;
    private String email;


    // no argument constructor
    public Person() {

        firstName = "";
        lastName = "";
        email = "";
    }

    // method used to set the first name
    // void means that the method has no return value
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // method used to get the first name
    // returns a string so must
    public String getFirstName() {
        return firstName;
    }

    // method used to set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // method used to get the last name
    public String getLastName() {
        return lastName;
    }

    // method used to set email
    public void setEmail(String email) {
        this.email = email;
    }

    // method used to get email
    public String getEmail() {
        return email;
    }

    // returns a string
    // abstract methods are methods in the abstract class
    // extending concrete class must override them
    public abstract String getDisplayText();

    // overrides toString method
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" + "Email: " + email + "\n";
    }
}