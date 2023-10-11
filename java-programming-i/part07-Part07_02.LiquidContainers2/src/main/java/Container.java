/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
public class Container {
    private int contain;
    
    public Container() {
        
    }
    
    public int contains() {
        return this.contain;
    }
    
    public void add(int amount) {
        if (amount >= 0) {
            int sum = this.contain + amount;
            if (sum <= 100) {
                this.contain = sum;
            } else {
                this.contain = 100;
            } 
        }    
    }
    
    public void remove(int amount) {
        if (amount >= 0) {
            int sub = this.contain - amount;
            if (sub >= 0) {
                this.contain = sub;
            } else {
                this.contain = 0;
            }
        }
    }
    
    public String toString() {
        return this.contain + "/100";
    }
}
