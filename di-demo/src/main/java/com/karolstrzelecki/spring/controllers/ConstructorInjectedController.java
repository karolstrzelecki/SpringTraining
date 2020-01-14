package com.karolstrzelecki.spring.controllers;

import com.karolstrzelecki.spring.services.GreetingService;

public class ConstructorInjectedController {

    public GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;

    }

    String sayHello(){
        return greetingService.sayGreeting();
    }

}
