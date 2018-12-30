package example.nio;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //create Spring container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call methods on the beac
        System.out.println(theCoach.getDailyWorkout());

        //lets call our new methods for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
