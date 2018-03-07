package hello;

import java.util.List;
import java.util.ArrayList;

public class ListOfPeople {
    
    private final List<Person> people;

    public ListOfPeople(){
        people = new ArrayList<>();

        people.add(new Person("Default Person", "just an example"));
    }

    public List<Person> getAllPeople(){
        return this.people;
    }

    public void addPerson(Person person){
        this.people.add(person);
    }


}