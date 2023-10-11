
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numery = new ArrayList<>();

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner numbers = new Scanner(Paths.get(file))) {
            while (numbers.hasNextLine()) {
                list.add(numbers.nextLine());
            }
            int numer = 0;
            for (String number : list){
                numer = Integer.valueOf(number);
                numery.add(numer);   
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        int i = 0;
        for (int numb: numery){
            if(numb >= lowerBound) {
                if (numb <= upperBound) {
                    i++;
                }
            }
        }
        System.out.println("Numbers: " + i);
        
    }

}
