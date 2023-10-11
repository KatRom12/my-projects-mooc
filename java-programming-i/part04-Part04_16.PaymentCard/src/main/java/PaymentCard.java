/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        double balance = this.balance - 2.60;
        if (balance >= 0) {
            this.balance = this.balance - 2.60;
        }    
    }
    
    public void eatHeartily() {
        double balance = this.balance - 4.60;
        if (balance >= 0) {
            this.balance = this.balance - 4.60;
        }    
    }
    
    public void addMoney(double amount) {
        double balance = this.balance + amount;
        if (amount <= 0) {
            
        } else if (balance < 150.0) {  
            this.balance = this.balance + amount;
        } else {
            this.balance = 150.0;
        }
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
