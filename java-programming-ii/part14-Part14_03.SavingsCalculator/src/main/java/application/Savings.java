/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marek Romanowski
 */
public class Savings {
    private double valueMonth;
    private double valueRate;
    private double balance;
    
    public Savings(double value){
        this.valueMonth = value;
    }
    
    public Savings(double value, double rate) {
        this.valueMonth = value;
        this.valueRate = rate;
    }
    
    public Map <Integer, Double> dataToMonthChart(){
        Map <Integer, Double> forChart = new HashMap<>();
        for (int i = 0; i <=30; i++){
            double sum = i * 12 * valueMonth;
            forChart.put(i, sum);
        }
        return forChart;
    }
    
    public Map <Integer, Double> dataToYearChart(){
        Map <Integer, Double> forChart = new HashMap<>();
        for (int i = 0; i <=30; i++){
            balance = valueMonth*12 * (Math.pow((1+valueRate/100),i) - 1)/(valueRate/100);
            forChart.put(i, balance);
        }
        return forChart;
    }    
}
