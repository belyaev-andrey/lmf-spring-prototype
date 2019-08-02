package org.acme.spring.event.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    @Autowired
    private ApplicationEventPublisher publisher;

    public String sayHello() {
        publisher.publishEvent(new HelloEvent(this));
        return "Hello";
    }

}
