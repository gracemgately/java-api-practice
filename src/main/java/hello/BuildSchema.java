package hello;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;

public class BuildSchema {

    private ListOfPeople listOfPeople = new ListOfPeople();
    
    public BuildSchema(){}
    
    public GraphQLSchema buildSchema(){
        return SchemaParser.newParser()
        .file("schema.graphqls")
        .resolvers(new Query(listOfPeople))
        .build()
        .makeExecutableSchema();
    }
}