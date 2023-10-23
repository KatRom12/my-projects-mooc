/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

/**
 *
 * @author Marek Romanowski
 */
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface inter;
    
    public ApplicationLogic(UserInterface ui){
        this.inter = ui;
    }
    
    public void execute(int times){
        for(int i = 0; i <times; i++){
            System.out.println("Application logic is working");
            inter.update();
        }
    }
}
