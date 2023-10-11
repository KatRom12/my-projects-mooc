
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int result = 0;
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= last; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}
