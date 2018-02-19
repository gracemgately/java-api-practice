package hello;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        get("/hello", (req, res) -> greeter.sayHello());
        get("/hello/:name", (req, res) -> greeter.greetMe(req.params(":name")));
    }
}