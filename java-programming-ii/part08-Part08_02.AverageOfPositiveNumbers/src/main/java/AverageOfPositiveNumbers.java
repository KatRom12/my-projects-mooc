
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("0")) {
                break;
            }
            int numb = Integer.valueOf(answer);
            if (numb > 0) {
                sum += numb;
                numbers += 1;
            }    
        }
        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        } else if (numbers >= 1) {
            System.out.println(1.0 * sum / numbers);
        }    
        

    }
}
