import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHw =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHw2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(beanHw == beanHw2);
        System.out.println(beanCat == beanCat2);

    }
}