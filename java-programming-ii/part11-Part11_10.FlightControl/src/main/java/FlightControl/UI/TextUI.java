/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.UI;

import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;
import java.util.Scanner;
import FlightControl.logic.FlightControl;

/**
 *
 * @author Marek Romanowski
 */
public class TextUI {
    private Scanner scanner;
    private FlightControl flightControl;
    
    public TextUI(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner; 
    }
    /*public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }  */  
    
    public void start() {
        
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println(); 
    }
    
    private void startAssetControl(){
        
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        
        while(true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            
            System.out.println("> ");
            String answer = scanner.nextLine();
            
            if (answer.equals("1")) {
                addAirplane(scanner);
            } else if (answer.equals("2")){
                addFlight(scanner);
            } else if (answer.equals("x")){
                break;
            }
        }
    }
    
    private void addAirplane(Scanner scanner){
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(scanner.nextLine());
                
        this.flightControl.addAirplane(id,capacity);
    }
    
    private void addFlight(Scanner scanner){
        System.out.println("Give the airplane id: ");
        Airplane answer = askForAnAirplane();
        System.out.println("Give the departure airport id: ");
        String airportDeparture = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String airportDestination = scanner.nextLine();
        
        flightControl.addFlight(answer, airportDeparture, airportDestination);
    }
  
    private Airplane askForAnAirplane() {
        Airplane airplane = null;
        while(airplane == null){
            String id = scanner.nextLine();
            airplane = flightControl.getAirplane(id);
            if(airplane == null) {
                System.out.println("There is no airplane with ID " + id + ".");
            }
        }
        return airplane;
    }
    
    private void startFlightControl(){
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        
        while(true) {
            System.out.println("Choose an action: ");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String answer = scanner.nextLine();
        
            if(answer.equals("1")) {
                printPlanes();
            } else if(answer.equals("2")){
                printFlights();
            } else if(answer.equals("3")){
                printPlaneDetails();
            } else if (answer.equals("x")){
                break;
            }
        }
    }
    
    private void printPlanes(){
        for(Airplane plane: flightControl.getAirplanes()){
            System.out.println(plane);
        }
    }
    
    private void printFlights(){
        for(Flight flight: flightControl.getFlights()){
            System.out.println(flight);
        }
    }
    
    private void printPlaneDetails(){
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println(flightControl.getAirplane(id));
    }
}
