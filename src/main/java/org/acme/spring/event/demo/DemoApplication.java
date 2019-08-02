package org.acme.spring.event.demo;

import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.support.GenericApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        GenericApplicationContext ctx = new GenericApplicationContext();
        ctx.registerBean(HelloBean.class);
        ctx.registerBean(DemoEventListener.class);
        AnnotationConfigUtils.registerAnnotationConfigProcessors(ctx);
        ctx.refresh();
        HelloBean bean = ctx.getBean(HelloBean.class);
        System.out.println(bean.sayHello());
    }

}
