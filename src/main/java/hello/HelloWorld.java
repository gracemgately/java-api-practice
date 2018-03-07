package hello;

import static spark.Spark.*;

public class HelloWorld {

    public static void main(String[] args) {
        //Greeter greeter = new Greeter();
        //BuildSchema schema = new BuildSchema();
        //schema.buildSchema();
        BuildSchema schema = new BuildSchema();


        get("/hello", (req, res) -> 
            //greeter.sayHello()
            schema.buildSchema()
        
        );
    }
}