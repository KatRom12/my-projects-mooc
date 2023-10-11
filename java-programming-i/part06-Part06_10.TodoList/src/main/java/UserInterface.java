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
import java.util.Scanner;

public class UserInterface {
    private TodoList theList;
    private Scanner scanner;
    
    public UserInterface (TodoList list, Scanner scanner) {
        this.theList = list;
        this.scanner = scanner;
    }
   
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String answer = scanner.nextLine();
            if (answer.equals("stop")) {
               break;
            }
            if (answer.equals("add")) {
               add();
            }
            if (answer.equals("list")) {
                list();
            }
            if (answer.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
       System.out.println("To add: ");
       String addition = scanner.nextLine();
       theList.add(addition);
    }
   
    public void list() {
       theList.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed?");
        int number = Integer.valueOf(scanner.nextLine());
        theList.remove(number);
    }
}
