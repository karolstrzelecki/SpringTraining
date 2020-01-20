package com.karolstrzelecki.spring.services;


import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello in English";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello in Spanish";
    }

    @Override
    public String getGermanGreeting() {
        return "Heil Hitler";
    }
}
