package greeting03;

public class Application {
    public static void main(String[] args) {
        StandartOutputRenderer renderer = new StandartOutputRenderer();

        //Create provider
        HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

        //Set the provider to the renderer
        renderer.setGreetingProvider(provider);

        //Call renderer
        renderer.render();

    }
}
