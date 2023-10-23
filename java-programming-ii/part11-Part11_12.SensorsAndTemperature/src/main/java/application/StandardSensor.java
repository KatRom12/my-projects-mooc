/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Marek Romanowski
 */
public class StandardSensor implements Sensor{
    private int temp;
    
    public StandardSensor(int numb) {
        this.temp = numb;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn(){
        
    }
    
    public void setOff(){
        
    }
    
    public int read() {
        return this.temp;
    }
}
