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
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        hand = new ArrayList<>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    @Override
    public int compareTo (Hand handy){
        return this.getSumOfCards() - handy.getSumOfCards();
    }
    
    public void print(){
        for(Card card: hand){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int getSumOfCards(){
        return hand.stream()
                .mapToInt(card -> card.getValue())
                .sum();
        
    }
    
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
                
    }
}
