package com.karolstrzelecki.spring.config;

import com.karolstrzelecki.spring.examplebeans.FakeDataSource;
import com.karolstrzelecki.spring.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

// @Properties will be now provided by SpringBoot application.properties
// We wouldn't need Autowired Envirioment too
// We wouldn't also need @Bean with properties placeholder

public class PropertyConfig {


    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUserName;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;

    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUsername(jmsUserName);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);

        return jmsBroker;

    }





}
