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
        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents = this.cents % 100;
        }

        return this;
    }

    public Money subtract(Money otherAmount) {
        this.dollars -= otherAmount.dollars;
        this.cents -= otherAmount.cents;
        if (this.cents < 0) {
            this.dollars -= (Math.abs(this.cents) + 99) / 100;
            this.cents += (Math.abs(this.cents) + 99) * 100;
        }

        return this;
    }

    public int compareTo(Money otherObject) {
        return Double.compare(Double.parseDouble(this.toString()), Double.parseDouble(this.toString()));
    }

    public boolean equals(Money otherObject) {
        return Objects.equals(this, otherObject);
    }

    public String toString() {
        return String.format("%d.%d", this.dollars, this.cents);
    }
}