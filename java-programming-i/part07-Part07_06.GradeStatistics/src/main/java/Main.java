
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> gradeList = new ArrayList<>();
        
        int amount = 0;
        int sum = 0;
        int amountPassed = 0;
        int sumPassed = 0;
        
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            String points = scanner.nextLine();
            
            if (points.equals("-1")) {
                break;
            }
            int point = Integer.valueOf(points);
            if (point >= 0 && point <=100) {
                sum = sum + point;
                amount = amount + 1;
                gradeList.add(point);
                if(point >= 50 && point<=100) {
                    amountPassed = amountPassed + 1;
                    sumPassed = sumPassed + point;
                }
            }
        }
        GradesManagement.pointAverage(sum, amount);
        GradesManagement.pointPassingAverage(sumPassed, amountPassed);
        GradesManagement.passPercentage(amountPassed, amount);
        GradesManagement.pointsToGrade(gradeList);
    }
}
