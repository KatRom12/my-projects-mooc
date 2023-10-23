/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap <LicensePlate, String> registery;
    
    public VehicleRegistry(){
        this.registery = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(registery.containsKey(licensePlate)) {
             return false;
        } else {
            registery.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
       
        return registery.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (registery.containsKey(licensePlate)) {
            registery.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate: registery.keySet()) {
            System.out.println(plate.toString());
        }    
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String own: registery.values()) {
            if (owners.contains(own)) {
                continue;
            } else {
                owners.add(own);
            }
        }
        for (String name: owners) {
            System.out.println(name);
        }    
    }
}

