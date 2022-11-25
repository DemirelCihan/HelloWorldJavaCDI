package greeting04;

public class StandardOutputRenderer implements  GreetingRenderer {
    private GreetingProvider greetingProvider = null;

    @Override
    public void setGreetingProvider(GreetingProvider provider) {
  this.greetingProvider = provider;
    }
    @Override
    public void render() {
   String greeting = greetingProvider.getGreeting();
        System.out.println(greeting);
    }

}
