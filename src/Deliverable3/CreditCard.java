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
        if ((Double.parseDouble(this.balance.toString()) + Double.parseDouble(amount.toString())) < Double.parseDouble(this.creditLimit.toString())) {
            this.balance.add(amount);
            System.out.println("Charge: " + amount.toDisplayString());
        } else {
            System.out.println("\n\n   Error: If this amount were charged to the current balance, the credit limit would be exceeded.\n\n");
        }
    }

    public void payment(Money amount) {
        if ((Double.parseDouble(this.balance.toString()) - Double.parseDouble(amount.toString())) > 0) {
            this.balance.subtract(amount);
            System.out.println("Payment: " + amount.toDisplayString());
        } else {
            System.out.println("\n\n   Error: If this payment were taken from the current balance, the balance would be below zero.\n\n");
        }
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