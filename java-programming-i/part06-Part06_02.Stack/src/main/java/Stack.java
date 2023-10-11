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

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack () {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }   
    }
    
    public void add(String value) {
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        int i = 0;
        int index = stack.size() - 1;
        ArrayList<String> values = new ArrayList<>();
        for (i = 0; i == index; i++) {
            int numb = index - i;
            String value = stack.get(numb);
            values.add(value);
        }
        return values;
    }
    
    public String take() {
        int index = stack.size() - 1;
        String remove = stack.get(index);
        stack.remove(remove);        
        return remove;
    }
        
}
