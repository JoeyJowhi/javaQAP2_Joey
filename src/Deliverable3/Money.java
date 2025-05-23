package Deliverable3;

import java.util.Objects;

public class Money {
    private long dollars, cents;


    //Constructors
    public Money(double amount) {
        this.dollars = (long) amount / 100;
        this.cents = (long) amount % 100;
    }

    //Task #1
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }


    //Instance Methods
    public Money add(Money otherAmount) {
        this.dollars += otherAmount.dollars;
        this.cents += otherAmount.cents;
        return this;
    }

    public Money subtract(Money otherAmount) {
        this.dollars -= otherAmount.dollars;
        this.cents -= otherAmount.cents;
        return this;
    }

    public int compareTo(Money otherObject) {
        double amt1 = Double.parseDouble(this.dollars + "." + this.cents);
        double amt2 = Double.parseDouble(otherObject.dollars + "." + otherObject.cents);

        return Double.compare(amt1, amt2);
    }

    public boolean equals(Money otherObject) {
        return Objects.equals(this, otherObject);
    }

    public String toString() {
        return String.format("$%,d.%d", this.dollars, this.cents);
    }
}