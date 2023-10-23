/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */


public class Hideout <T>{
    private T hideOut;
    
    public void putIntoHideout(T toHide){
        hideOut = toHide;
    }
    
    public T takeFromHideout(){
        if (hideOut == null){
            return null;
        }
        T thing = hideOut;
        hideOut = null;
        return thing;
        
    }
    
    public boolean isInHideout(){
        if(hideOut != null){
            return true;
        } else {
            return false;
        }
    }
}
