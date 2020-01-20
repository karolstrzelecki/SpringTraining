package com.karolstrzelecki.spring;

import com.karolstrzelecki.spring.controllers.ConstructorInjectedController;
import com.karolstrzelecki.spring.controllers.MyController;
import com.karolstrzelecki.spring.controllers.PropertyInjectedController;
import com.karolstrzelecki.spring.controllers.SetterInjectedController;
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

        //controller.hello();
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
