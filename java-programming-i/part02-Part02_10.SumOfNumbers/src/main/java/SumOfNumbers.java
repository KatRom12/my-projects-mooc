
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.nextLine());
            if (numb == 0) {
                break;
            } else {
                numbers = numbers + numb;
            }
        } 
        System.out.println("Sum of the numbers: " + numbers);

    }
}
