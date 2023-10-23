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
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> words;
    
    public DictionaryOfManyTranslations() {
        this.words = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.words.putIfAbsent(word, new ArrayList<String>());
        
        //ArrayList<String> translations = this.words.get(word);
        //translations.add(translation);
        
        this.words.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if(words.containsKey(word)) {
            return words.get(word);  
        } else {
            ArrayList<String> things = new ArrayList<>();
            return things;
        }
    }
    
    public void remove(String word) {
        words.remove(word);
    }
}
