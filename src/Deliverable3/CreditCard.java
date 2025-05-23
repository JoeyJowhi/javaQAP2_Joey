package Deliverable3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;


    //Constructors
    public CreditCard(Person newCardHolder, Money limit) {
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;

    }


    //Instance Methods
    public void charge(Money amount) {

    }

    public void payment(Money amount) {

    }


    //Getter Methods
    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public String getPersonals() {
        return this.owner.toString();
    }
}