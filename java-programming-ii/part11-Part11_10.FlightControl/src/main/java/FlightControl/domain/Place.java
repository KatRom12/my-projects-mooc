/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author Marek Romanowski
 */
public class Place {
    private String name;
    
    public Place(String name){
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
