package com.karolstrzelecki.spring;

import com.karolstrzelecki.spring.controllers.ConstructorInjectedController;
import com.karolstrzelecki.spring.controllers.MyController;
import com.karolstrzelecki.spring.controllers.PropertyInjectedController;
import com.karolstrzelecki.spring.controllers.SetterInjectedController;
import com.karolstrzelecki.spring.examplebeans.FakeDataSource;
import com.karolstrzelecki.spring.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//Jeżeli znisczymy strukturę plików (przerzucimy paczkę z np kontrolerami), Spring sam z siebie się zagubi
// i zacznie sypać błędami, jednak możemy temu zaradzić przez annotację @ComponentScan
//przykład
//@ComponentScan(basePackages = {"karol.services", "guru.springframework"})
// w basePackages podajemy tablicę z opcjonalnymi ścieżkami
public class DiDemoApplication {

    public static void main(String[] args) {



        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());

    }

    //YAML - shortcut: Yet Another Markup Language, but it is much more suited towards describing data structures
    // than being actual markup language

}
