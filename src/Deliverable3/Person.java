package Deliverable3;

public class Person {
    private String lastName, firstName;
    private Address home;

    //Constructors
    public Person(String ln, String fn, Address home) {
        this.lastName = ln;
        this.firstName = fn;
        this.home = home;
    }


    //Instance Methods
    public String toString() {
        return String.format("%s %s, %s", this.firstName, this.lastName, this.home);
    }
}
