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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> hold;
    private int weight;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        
        if((weight + suitcase.totalWeight()) <= this.maximumWeight) {
            this.hold.add(suitcase);
            weight = weight + suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for(Suitcase suit: hold) {
            suit.printItems();
        }
    }
    
    public String toString() {
        return hold.size() + " suitcases (" + weight + " kg)";
    }
}
