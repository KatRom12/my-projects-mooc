
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
