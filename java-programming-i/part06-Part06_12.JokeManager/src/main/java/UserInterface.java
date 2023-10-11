/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String answer = this.scanner.nextLine();
                if (answer.equals("X")) {
                    break;
                }
                if (answer.equals("1")) {
                    System.out.println("Write the joke to be added:");
                    String joke = this.scanner.nextLine();
                    this.manager.addJoke(joke);
                } else if (answer.equals("2")) {
                    System.out.println("Drawing jokes:");
                    System.out.println(this.manager.drawJoke());
                } else if (answer.equals("3")) {
                    System.out.println("Printing jokes:");
                    this.manager.printJokes();
                }
        }    
                
    }
}
