package greeting03;

public class StandartOutputRenderer {
    private HelloWorldGreetingProvider greetingProvider = null;

    public void setGreetingProvider(HelloWorldGreetingProvider provider){
        this.greetingProvider = provider;
    }
    //Rendering logic can change without affecting the rest of the application

    public void render(){
        String greeting = greetingProvider.getGreeting();
        System.out.println(greeting);
    }

}
