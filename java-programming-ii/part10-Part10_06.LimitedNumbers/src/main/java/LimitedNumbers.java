
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            inputs.add(input);
        }
        ArrayList<Integer> numbers = inputs.stream()
        
                .filter(numb -> numb >= 1 && numb <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        
        for (int digit: numbers) {
            System.out.println(digit);
        }    

    }
}
