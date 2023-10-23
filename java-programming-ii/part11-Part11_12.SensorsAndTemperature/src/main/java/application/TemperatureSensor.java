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
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean isWorking;
    private int temp;
    
    public TemperatureSensor() {
        isWorking = false;
    }    
    
    public boolean isOn(){
        return isWorking;
    }
    
    public void setOn() {
        isWorking = true;
    }
    
    public void setOff(){
        isWorking = false;
    }
    
    public int read(){
        if (isWorking = true) {
            temp = new Random().nextInt(61) - 30;
            return temp;
        } else {
            throw new IllegalStateException();
        }
    }
}
