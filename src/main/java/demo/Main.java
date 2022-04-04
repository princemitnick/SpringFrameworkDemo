package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String... args){

        /*
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

         */
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());


        Pharmacist pharmacist = context.getBean(Pharmacist.class);
        pharmacist.setQualification("Analysis");

        System.out.println(pharmacist);

        Pharmacist pharmacist1 = context.getBean(Pharmacist.class);
        System.out.println(pharmacist1);

    }
}

