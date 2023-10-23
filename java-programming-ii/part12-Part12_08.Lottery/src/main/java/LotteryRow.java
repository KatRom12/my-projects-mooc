
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        
        // Implement the random number generation here
        // the method containsNumber is probably useful
        int end = 7;
        while (this.numbers.size() < 7){
                int numb = random.nextInt(40) + 1;
                if (!(containsNumber(numb))) {
                    this.numbers.add(numb);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int numb: this.numbers){
            if (numb == number){
                return true;
            }
    }
        return false;
    }
}

