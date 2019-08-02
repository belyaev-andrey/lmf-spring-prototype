package org.acme.spring.event.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoEventListener {

    @EventListener
    public String handleContextStart(HelloEvent helloEvent) {
        System.out.println("Application event handled: "+helloEvent.getTimestamp());
        return helloEvent.toString();
    }

}
