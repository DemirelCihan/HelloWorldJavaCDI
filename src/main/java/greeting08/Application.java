package greeting08;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        BeanFactory  factory = new ClassPathXmlApplicationContext("");

        GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
        renderer.render();
    }
}
