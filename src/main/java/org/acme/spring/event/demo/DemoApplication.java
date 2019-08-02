package org.acme.spring.event.demo;

import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.support.GenericApplicationContext;

import java.util.logging.Logger;

public class DemoApplication {

    private static final Logger log = Logger.getLogger(DemoApplication.class.getName());

    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();
        ctx.registerBean(HelloBean.class);
        ctx.registerBean(DemoEventListener.class);
        ctx.registerBean(LambdaEventListenerFactory.class);
        AnnotationConfigUtils.registerAnnotationConfigProcessors(ctx);
        ctx.refresh();
        HelloBean bean = ctx.getBean(HelloBean.class);
        log.info(bean.sayHello());
    }

}
