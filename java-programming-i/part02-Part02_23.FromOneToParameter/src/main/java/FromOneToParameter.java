

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber (5);

    }
    
    public static void printUntilNumber(int number) {
        int order = 0;
        while (order < number) {
            order ++;
            System.out.println(order);       
        }
    }

}
