package greeting07;


public class Application {

    public static void main(String[] args) {
        ObjectProviderFramework framework = new ObjectProviderFramework();

        GreetingRenderer renderer =(GreetingRenderer) framework.getObject("D:\\Spring\\src\\main\\java\\greeting07\\StandardOutputRenderer","D:\\Spring\\src\\main\\java\\greeting07\\HelloWorldGreetingProvider");
        renderer.render();

    }
}
