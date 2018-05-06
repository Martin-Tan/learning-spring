package com.vagrant.demo.mavendemo;

import com.vagrant.demo.mavendemo.scope.PersonDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(ScopeApplication.class, args);

        PersonDao personDao =
                applicationContext.getBean(PersonDao.class);
        System.out.println(personDao);


        PersonDao personDao2 =
                applicationContext.getBean(PersonDao.class);
        System.out.println(personDao2);

    }
}
