package greeting06;

public class Application {

    public static void main(String[] args) {
        ObjectProviderFramework framework = new ObjectProviderFramework();

        GreetingRenderer renderer = (GreetingRenderer) framework.getObject("D:\\Spring\\src\\main\\java\\greeting06\\StandardOutputRenderer");
        GreetingProvider provider = (GreetingProvider) framework.getObject("D:\\Spring\\src\\main\\java\\greeting06\\HelloWorldGreetingProvider");


        renderer.setGreetingProvider(provider);
        renderer.render();

        renderer = (GreetingRenderer)  framework.getObject("D:\\Spring\\src\\main\\java\\greeting06\\ErrorOutputRenderer");
        provider = (GreetingProvider)  framework.getObject("D:\\Spring\\src\\main\\java\\greeting06\\SelamGreetingProvider");

        renderer.setGreetingProvider(provider);
        renderer.render();

        provider = (GreetingProvider)  framework.getObject("D:\\Spring\\src\\main\\java\\greeting06\\GermanGreetingProvider");

        renderer.setGreetingProvider(provider);
        renderer.render();
    }
}
