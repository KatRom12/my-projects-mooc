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

public class TodoList {
    private ArrayList<String> theList;
    
    public TodoList() {
        this.theList = new ArrayList<>();
    }
    
    public void add(String task) {
        this.theList.add(task);
    }
    
    public void print() {
       
        for (int i = 0; i < theList.size(); i++) {
            int number = i + 1;
            System.out.println(number + ": " + theList.get(i));
            
        }
    }
    
    public void remove (int number) {
        theList.remove(theList.get(number - 1));
    }
    
}
