
public class Money {

    private final int euros;
    private final int cents;
    private final int eurosNCents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
        this.eurosNCents = (this.euros*100) + this.cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);       
        
        return newMoney;
    }
    public boolean lessThan(Money compared) {
        Money lessThan = new Money(this.euros, this.cents);        
        int comparedEurosNCents = (compared.euros*100) + compared.cents;
        return eurosNCents < comparedEurosNCents;
    }
    public Money minus(Money decreaser) {
        int decreaserEurosNCents = (decreaser.euros*100) + decreaser.cents;
        int eurosMinus = this.euros;
        int centsMinus = this.cents; 
        int minus = 0;
        if (this.eurosNCents-decreaserEurosNCents < 0) {
            eurosMinus = 0;
            centsMinus = 0;
        } else {
            minus = this.eurosNCents-decreaserEurosNCents;
            eurosMinus = minus/100;
            centsMinus = minus % 100;
        }
        
        Money newMoney = new Money(eurosMinus, centsMinus);
        
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
