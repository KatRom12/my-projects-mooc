
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                break;
            }
            words.add(answer);
        }
        
        
        String combined = words.stream()
                .reduce("", (previousString, word) -> previousString + word +"\n");
        System.out.println(combined);

    }
}
