
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.nextLine());
            if (numb == 0) {
                break;
            } else {
                numbers = numbers + 1;
                sum = sum + numb;
            }
        }
        double average = (1.0 * sum)/ numbers;
        System.out.println("Average of the numbers: " + average);

    }
}
