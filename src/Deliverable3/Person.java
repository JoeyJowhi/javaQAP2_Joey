package Deliverable3;

public class Person {
    private String lastName, firstName;
    private Address home;


    //Instance Methods
    public String toString() {
        return String.format("%s %s, %s", this.firstName, this.lastName, this.home);
    }
}
