/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Marek Romanowski
 */
public class check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        List <String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))){
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                list.add(row);
            } 
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
        
        for (String rowy: list){
            for(int i = 1; i < list.size(); i++){
                String[] parties = rowy.split("\t");
                String partyName = parties[0];
                int year = 1968;
                Map<Integer, Double> results = new HashMap<>();
                for(int p = 1; p < parties.length; p++){
                    results.put(year, Double.valueOf(parties[p]));
                    year +=4;
                }
                values.put(partyName, results);
            }
        }
        
        
        System.out.println(values);
    }
    
    
}
