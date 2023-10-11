
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
          
    public Money plus(Money addition) {
        int addEuro = addition.euros();
        int addCent = addition.cents();
        int newEuros = this.euros() + addEuro;
        int newCents = this.cents() + addCent;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;    
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        
        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            }
        }
        return false;
    }
    public Money minus(Money decreaser) {
        int newEuros = this.euros();
        int newCents = this.cents();
        int decEuro = decreaser.euros();
        int decCent = decreaser.cents();
        if (newCents < decCent) {
            newEuros = newEuros - 1;
            newCents = 100 + newCents - decCent;
        } else {   
            newCents = newCents - decCent;
        }    
        if (newEuros < decEuro) {
            newEuros = 0;
            newCents = 0;
        } else {   
            newEuros = newEuros - decEuro;
        }    
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }

}
