package com.karolstrzelecki.spring.controllers;

import com.karolstrzelecki.spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    public GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;

    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
