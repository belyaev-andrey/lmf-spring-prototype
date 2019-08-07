package org.acme.spring.event.demo;

import org.springframework.context.ApplicationListener;
//import org.acme.spring.event.demo.ApplicationListenerLambdaMethodAdapter;
import org.springframework.context.event.ApplicationListenerMethodAdapter;
import org.springframework.context.event.DefaultEventListenerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Logger;

@Component
public class LambdaEventListenerFactory extends DefaultEventListenerFactory {

    private static final Logger log = Logger.getLogger(LambdaEventListenerFactory.class.getName());

    @Override
    public int getOrder() {
        return super.getOrder()-1;
    }

    @Override
    public ApplicationListener<?> createApplicationListener(String beanName, Class<?> type, Method method) {
        log.fine("Creating lambda-based event listener");
        return new ApplicationListenerMethodAdapter(beanName, type, method);
        //return new ApplicationListenerLambdaMethodAdapter(beanName, type, method);
    }


}
