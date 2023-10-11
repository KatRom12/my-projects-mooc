
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] part = text.split(",");
            int numb = Integer.valueOf(part[1]);
            if (numb > oldest) {
                oldest = numb;
            }
            
        }
        System.out.println("Age of the oldest is: " + oldest);

    }
}
