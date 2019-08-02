package org.acme.spring.event.demo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DemoEventListener {

    private static final Logger log = Logger.getLogger(DemoEventListener.class.getName());

    @EventListener
    public String handleHelloEvent(HelloEvent helloEvent) {
        log.info("Application event handled: "+helloEvent.getTimestamp());
        return helloEvent.toString();
    }

}
