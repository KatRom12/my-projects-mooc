/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }
    
    public void printBalance() {
        System.out.println(this.balance);
    }
    
    public void waitOneYear () {
        this.balance = this.balance * this.interestRate;
    }
}
