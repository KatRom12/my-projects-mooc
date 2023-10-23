/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marek Romanowski
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        for(Person person: peopleToAdd){
            employees.add(person);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person person = iterator.next();
            if(person.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
