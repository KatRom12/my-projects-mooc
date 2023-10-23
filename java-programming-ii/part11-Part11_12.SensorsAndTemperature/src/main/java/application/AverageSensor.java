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
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public boolean isOn(){
        boolean isWorking = true;
        for(Sensor sensor: sensors){
            if(!(sensor.isOn())){
                isWorking = false;
            }
        }
        return isWorking;
    }
    public void setOn(){
        for (Sensor sensor: sensors){
            sensor.setOn();
        }
    }
    public void setOff(){
        for(Sensor sensor: sensors) {
            sensor.setOff();
        }
    }
    public int read(){
        int sum = 0;
        if (!(sensors.isEmpty()) || this.isOn()) {
            for(Sensor sensor: sensors){  
            sum = sum + sensor.read();
            }
            int average = sum / sensors.size();
            readings.add(average);
            return average;
        } else{
            throw new IllegalStateException();
        }            
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
