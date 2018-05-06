package com.vagrant.demo.mavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MavenDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(MavenDemoApplication.class, args);
        BinarySearchService binarySearchService = applicationContext
                .getBean(BinarySearchService.class);
        int result = binarySearchService
                .binarySearch(new int[]{1, 2, 3, 4}, 4);
        System.out.println(result);
    }
}
