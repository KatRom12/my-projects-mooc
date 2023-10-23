/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
public class LiteracyRate {
    private String country;
    private int year;
    private String gender;
    private double rate;
    
    public LiteracyRate (String country, int year, String gender, double rate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rate = rate;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getGender(){ 
        return this.gender;
    }
    
    public double getRate() {
        return this.rate;
    }
    
   
   
    
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.rate;
    }
}
