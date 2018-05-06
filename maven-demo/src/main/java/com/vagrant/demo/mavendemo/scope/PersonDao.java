package com.vagrant.demo.mavendemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDao {
    @Autowired
    JdbConnection jdbConnection;

    public JdbConnection getJdbConnection() {
        return jdbConnection;
    }

    public void setJdbConnection(JdbConnection jdbConnection) {
        this.jdbConnection = jdbConnection;
    }
}
