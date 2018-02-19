package hello;

public class Greeter {
    public String sayHello() {
        return "Hello world!";
    }
    public String greetMe(String name){
        return ("Nice to meet you, ").concat(name).concat("!");
    }
}