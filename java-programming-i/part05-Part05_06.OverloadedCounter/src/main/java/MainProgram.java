
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter one = new Counter(1);
        Counter two = new Counter(15);
        
        one.increase();
        System.out.println(one);
        one.increase(-3);
        System.out.println(one);
        one.increase(4);
        System.out.println(one);
        two.decrease(-3);
        System.out.println(two);
        two.decrease();
        
        
        System.out.println(two);
    }
}
