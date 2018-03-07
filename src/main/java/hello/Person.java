package hello;

public class Person {
    
    private final String name, description;
    
    public Person(String nom, String descript){
        this.name = nom;
        this.description = descript;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}