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
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String addition = scan.nextLine();
                list.add(addition);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removing = Integer.valueOf(scan.nextLine());
                list.remove(removing);
            }
        }
    }
}
