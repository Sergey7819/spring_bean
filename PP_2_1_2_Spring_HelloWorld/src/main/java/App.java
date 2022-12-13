import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("catBean");
        cat.say();

        Cat cat1 = (Cat) applicationContext.getBean("catBean");
        cat1.say();

        System.out.println("Переменные ссылаются на один и тот же объект? " + (bean==bean1));

        System.out.println("Переменные ссылаются на один и тот же объект? " + (cat==cat1));



    }
}