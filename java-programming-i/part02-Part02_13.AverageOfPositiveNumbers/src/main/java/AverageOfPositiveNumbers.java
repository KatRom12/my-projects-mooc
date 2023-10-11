
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum =0;
        int positive = 0;
        while (true) {
            int numb = Integer.valueOf(scanner.nextLine());
            if (numb == 0) {
                break;
            } else if (numb > 0) {
                sum = sum + numb;
                positive = positive + 1;
            }
        }
        if (positive > 0) {
            System.out.println(1.0 * sum / positive);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
