package greeting07;

public class HelloWorldGreetingProvider implements GreetingProvider{
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
