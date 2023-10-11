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

public class GradesManagement {
  
  
    public static void pointAverage(int sum, int amount) {
        double average = 1.0 * sum / amount;
        System.out.println("Point average (all): " + average);
    }
        
    
    
    public static void pointPassingAverage(int sumPassed, int amountPassed) {
        double passingAverage = 1.0 * sumPassed / amountPassed;
        if (amountPassed == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
    }
    
    public static void passPercentage(int amountPassed, int amount) {
        double passPercentage = 100.0 * amountPassed / amount;
        System.out.println("Pass percentage: " + passPercentage);
    }
    
    public static void pointsToGrade(ArrayList<Integer> list) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        
        for (int points: list)
        if (points < 50) {
            zero += 1;
        } else if (points < 60) {
            one += 1;
        } else if (points < 70) {
            two += 1;
        } else if (points < 80) {
            three += 1;
        } else if (points < 90) {
            four += 1;     
        } else if (points < 101) {
            five += 1;
        }
        
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(five);
        grades.add(four);
        grades.add(three);
        grades.add(two);
        grades.add(one);
        grades.add(zero);
        System.out.println("Grade distribution:");
        
        for (int i = 0; i <= grades.size() - 1; i++) {
            System.out.print(grades.size() - 1 - i + ": ");
            for (int j = 0; j < grades.get(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
