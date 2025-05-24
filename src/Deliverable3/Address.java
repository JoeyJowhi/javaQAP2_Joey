package Deliverable3;

public class Address {
    private String street, city, state, zip;


    //Constructors
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    //Instance Methods
    public String toString() {
        return String.format("%s, %s, %s, %s", this.street, this.city, this.state, this.zip);
    }
}