/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> list;
    
    public Abbreviations() {
        this.list = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation is already in the list");
        } else {
            list.put(abbreviation, explanation);
        }
        
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (list.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor (String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return list.get(abbreviation);
        } else {
            return null;
        }
    }
}
