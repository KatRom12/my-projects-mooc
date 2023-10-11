
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        Message m = new Message("Bartek", "Hello");
        Message k = new Message("Kasia", "jdfwhaoifhwoiefhoiwghjeoirgh");
        MessagingService jak = new MessagingService();
        jak.add(m);
        jak.add(k);
        System.out.println(jak.getMessages());
        
    }
}
