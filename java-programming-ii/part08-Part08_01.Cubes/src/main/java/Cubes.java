
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("end")) {
                break;
            }
            int number = Integer.valueOf(answer);
            System.out.println(number*number*number);
        }
        
        

    }
}
