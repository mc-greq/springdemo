package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean from spring container
        Coach theCoach = context.getBean("myCricketCoach", Coach.class);

        //call methods on the bean
//        System.out.println();

        //close the context
        context.close();
    }
}