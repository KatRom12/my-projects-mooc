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

public class Herd implements Movable{
    private ArrayList<Movable> herd; 
    
    public Herd() {
        herd = new ArrayList<>();
    }
    
    public String toString() {
        String animals = "";
        for (Movable animal: herd) {
            animals += animal.toString() + "\n";
        }
        return animals;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable animal: herd) {
            animal.move(dx, dy);
        }
    }
}
