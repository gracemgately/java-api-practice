package hello;

import java.util.List;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements  GraphQLQueryResolver {
    
    private final ListOfPeople listOfPeople;

    public Query(ListOfPeople listOfPeople){
        this.listOfPeople = listOfPeople;
    }

    public List<Person> allPeople(){
        return listOfPeople.getAllPeople();
    }
}