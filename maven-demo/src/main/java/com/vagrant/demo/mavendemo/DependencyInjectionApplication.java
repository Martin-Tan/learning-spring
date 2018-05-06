package com.vagrant.demo.mavendemo;

import com.vagrant.demo.mavendemo.indepencyInjection.BinarySearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(DependencyInjectionApplication.class, args);
        BinarySearchService binarySearchService = applicationContext
                .getBean(BinarySearchService.class);
        int result = binarySearchService
                .binarySearch(new int[]{1, 2, 3, 4}, 4);
        System.out.println(result);
    }
}
