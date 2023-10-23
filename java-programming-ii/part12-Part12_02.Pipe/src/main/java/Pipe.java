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

public class Pipe <T>{
    private ArrayList<T> pipe;
    
    public Pipe(){
        pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(pipe.isEmpty()){
            return null;
        }
        T last = pipe.get(0);
        pipe.remove(pipe.get(0));
        return last;
    }
    
    public boolean isInPipe(){
        if(!(pipe.isEmpty())){
            return true;
        } else {
            return false;
        }
    }
}
