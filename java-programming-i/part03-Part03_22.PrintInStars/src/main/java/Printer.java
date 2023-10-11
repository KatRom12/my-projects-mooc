
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int end = array.length;
        
        for (int i = 0; i < end; i++) {
            int numb = array[i];
            printStars(numb);
        }
    }
    
    public static void printStars(int number) {
        int start = 0;
        int meta = number;
        while (start < meta) {
            System.out.print("*");
            start++;
        }    
        System.out.println("");
    }    
}
