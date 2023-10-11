
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int index = 0;
        int end = array.length - 1;
        while (true) {
            if (index < end) {
                System.out.print(array[index] + ", ");
                index++;
            } else if (index == end) {
                System.out.print(array[index] + " ");
                break;
            }
        }
    }
}
