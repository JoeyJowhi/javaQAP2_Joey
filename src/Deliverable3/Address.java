package Deliverable3;

public class Address {
    private String street, city, state, zip;


    //Instance Methods
    public String toString() {
        return String.format("%s, %s, %s, %s", this.street, this.city, this.state, this.zip);
    }
}