package Yang.business;

// public class Employee inherits the Person class
public class Employee extends Person {

    // variable social security number
    private String socialNum;

    // no-argument constructor for Employee
    public Employee() {
        super();
        socialNum = "";
    }

    // method that sets the social security number
    public void setSocialNum(String socialNum) {
        this.socialNum = socialNum;
    }

    // method that gets the social security number
    public String getSocialNum() {
        return socialNum;
    }

    // implementation of getDisplayText
    // appends social security number to employee
    public String getDisplayText() {
        return super.toString() + "Social security number: " + socialNum + "\n";
    }
}
