
public class HealthStation {
    private int i;
   
    
    public HealthStation() {
       this.i = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int weigh = person.getWeight();
        this.i++;
        return weigh;
    }
    public void feed(Person person) {
        int feed = person.getWeight() + 1;
        person.setWeight(feed);
    }
    
     
    public int weighings() {
        return this.i;
    }  
                 
    

}
