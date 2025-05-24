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
        if (Double.parseDouble(this.balance.add(amount).toString()) > Double.parseDouble(this.creditLimit.toString())) {
            this.balance.add(amount);
        }
    }

    public void payment(Money amount) {
    }


    //Getter Methods
    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }
}