package greeting08;

public class HelloWorldMessageProvider {
    static class HelloWorldGreetingProvider implements GreetingProvider {
        @Override
        public String getGreeting() {
            return "Hello World";
        }
    }
}
