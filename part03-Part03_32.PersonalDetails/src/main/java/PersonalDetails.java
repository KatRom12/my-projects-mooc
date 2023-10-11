
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numb = 0;
        int longest = 0;
        String name = "none";
        
        while (true) {
            String nameAndYear = scanner.nextLine();
            if (nameAndYear.equals("")) {
                break;
            }
            String[] parts = nameAndYear.split(",");
            int length = parts[0].length();
            if (length > longest) {
                longest = length;
                name = parts[0];
            }
            int year = Integer.valueOf(parts[1]);
            sum = sum + year;
            numb++;
        }
        System.out.println("Longest name is: " + name);
        System.out.println("Average of the birth years: " + 1.0* sum / numb);

    }
}
