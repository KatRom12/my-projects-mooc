

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(2);


    }
    
    public static void printFromNumberToOne(int number) {
        int rep = 0;
        int back = number;
        while (rep < number) {
            System.out.println(back);
            rep ++;
            back -=1;
        }
                
    }

}
