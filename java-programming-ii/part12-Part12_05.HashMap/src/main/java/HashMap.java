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
import java.lang.Math;

public class HashMap <K, V> {
    private ArrayList<Pair<K,V>>[] values;
    private int firstFreeIndex;
    
    public HashMap(){
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode()% this.values.length);
        
        if(this.values[hashValue] == null) {
            return null;
        }
        
        ArrayList <Pair<K,V>> valuesAtIndex = this.values[hashValue];
        for(int i = 0; i < valuesAtIndex.size(); i++){
            if(valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        return null;
    }
    
    public void add(K key, V value){
        ArrayList<Pair<K,V>> valuesAtIndex = getArrayListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index <0) {
            valuesAtIndex.add(new Pair(key, value));
            this.firstFreeIndex ++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }
    
    private ArrayList<Pair<K,V>> getArrayListBasedOnKey(K key){
        int hashValue = Math.abs(key.hashCode()% this.values.length);
        if(values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }    
        return values[hashValue];
    }
    
    private int getIndexOfKey (ArrayList<Pair<K,V>> list, K key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(key)) {
                return i;
            }
        }
        return -1;
    } 
    
    private void grow(){
        ArrayList<Pair<K,V>> [] newOne = new ArrayList [this.values.length * 2];
        for(int i = 0; i < this.values.length; i++){
            copy(newOne, i);
        }
    }
    
    private void copy(ArrayList<Pair<K,V>>[] newArrayList, int fromInd){
        for(int i = 0; i < this.values[fromInd].size(); i ++){
            Pair<K,V> value = this.values[fromInd].get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArrayList.length);
            if (newArrayList[hashValue] == null){
                newArrayList[hashValue] = new ArrayList<>();
            }
            newArrayList[hashValue].add(value);
        }
    }
    
    public V remove(K key){
        ArrayList<Pair<K,V>> valuesAtIndex = getArrayListBasedOnKey(key);
        if (valuesAtIndex.size() == 0){
            return null;
        } 
        int index = getIndexOfKey(valuesAtIndex, key);
        if(index <0) {
            return null;
        }
        Pair <K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
