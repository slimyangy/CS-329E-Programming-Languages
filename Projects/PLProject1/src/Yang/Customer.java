package Yang;

/**
 * Created by temp on 2/6/2016.
 */

public class Customer {

    public String name;
    public String address;
    public String state;
    public String city;
    public String zipcode;

    public String getNameAndAddress() {
        return name + "\n" + address + "\n" + city + ", " + state + " " + zipcode;
    }
}

