package com.karolstrzelecki.spring.controllers;

import com.karolstrzelecki.spring.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){

        return greetingService.sayGreeting();

    }


}
