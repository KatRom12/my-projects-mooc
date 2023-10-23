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
public class Flight {
    private Airplane airplane;
    private Place departurePlace;
    private Place destinationPlace;
    
    public Flight(Airplane airplane, Place departurePlace, Place destinationPlace){
        this.airplane = airplane;
        this.departurePlace = departurePlace;
        this.destinationPlace = destinationPlace;
    }
    
    public Airplane getAirplane(){
        return this.airplane;
    }
    
    public Place getDeparturePlace(){
        return this.departurePlace;
    }
    
    public Place getDestinationPlace(){
        return this.destinationPlace;
    }
    
    public String toString(){
        return this.airplane.toString() + " (" + this.departurePlace.getName() + "-" + this.destinationPlace.getName() + ")";
    }
}
