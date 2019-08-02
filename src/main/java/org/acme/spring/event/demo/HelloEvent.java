package org.acme.spring.event.demo;

import org.springframework.context.ApplicationEvent;

public class HelloEvent extends ApplicationEvent {
    public HelloEvent(Object source) {
        super(source);
    }
}
