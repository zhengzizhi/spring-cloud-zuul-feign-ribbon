package com.contoso.greeting;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceGreetingHystric implements ScheduleServiceGreeting {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
