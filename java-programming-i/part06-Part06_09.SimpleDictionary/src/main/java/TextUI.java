/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    } 
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }    
            if (command.equals("add")) {
                add();    
            } else if (command.equals("search")) {
                    search();
            } else {
                System.out.println("Unknown command");
            }    
            
        }
    }    
    
    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        
        this.simpleDictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated:");
        String translation = this.scanner.nextLine();
        
        String transleted = this.simpleDictionary.translate(translation);
        if (transleted == null) {
            System.out.println("Word " + translation + " was not found");
        } else { 
            System.out.println("Translation: " + transleted);
        }   
    }
    
}
