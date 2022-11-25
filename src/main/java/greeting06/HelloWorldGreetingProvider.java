package greeting06;

public class HelloWorldGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
