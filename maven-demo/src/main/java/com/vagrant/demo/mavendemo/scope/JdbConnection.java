package com.vagrant.demo.mavendemo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class JdbConnection {
    public JdbConnection() {
        System.out.println("JDB Connection");
    }
}
