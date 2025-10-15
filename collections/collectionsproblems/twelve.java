//Create a person class with name (String) and age(int).Create an ArrayList of person objects. Sort the list first by age (ascending),and if ages are equal, then by name(alphabetical) using collections.sort() and a customer comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;;

class Person{
    String name;
        int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;

    }
    public String toString(){
        return "Person{name='"+name+"',age="+age+'}';
    }
}
public class twelve {
    public static void main(String[] args) {
        ArrayList<Person>people = new ArrayList<>();
        people.add(new Person("Alice",12));
        people.add(new Person("Adam", 23));
        people.add(new Person("Chris", 45));
        people.add(new Person("Charlie", 32));
        System.out.println(people);
        Collections.sort(people,new Comparator<Person>(){
            public int compare(Person p1,Person p2) {
            int ageCom = Integer.compare(p1.age,p2.age);
            if(ageCom!=0){
                return ageCom;
            }
            return p1.name.compareTo(p2.name);

        }    
        });
        System.out.println("sorted people"+people);
        
    }  
    }   

