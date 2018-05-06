package com.vagrant.demo.mavendemo;

import com.vagrant.demo.mavendemo.scope.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(ScopeApplication.class, args);

        PersonDao personDao =
                applicationContext.getBean(PersonDao.class);
        LOGGER.info("{}", personDao);
        LOGGER.info("{}", personDao.getJdbConnection());


        PersonDao personDao2 =
                applicationContext.getBean(PersonDao.class);
        LOGGER.info("{}", personDao2);
        LOGGER.info("{}", personDao2.getJdbConnection());

    }
}
